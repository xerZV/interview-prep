package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.phoneCameraApp;

import org.junit.Test;

import java.util.Scanner;

public class PhoneCameraAppTest {
    private static final String CAMERA_PLUS = "CAMERA_PLUS";
    private static final String CAMERA_BASIC = "CAMERA_BASIC";

    @Test
    public void testPhoneCameraApp() {
        System.out.println(CAMERA_PLUS);
        PhoneCameraApp cameraApp = getCameraApp(CAMERA_PLUS);
        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.share();

        System.out.println();
        System.out.println(CAMERA_BASIC);
        cameraApp = getCameraApp(CAMERA_BASIC);
        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.share();
    }

    private PhoneCameraApp getCameraApp(String type) {
        return type.equalsIgnoreCase(CAMERA_PLUS) ? new CameraPlusApp(Social.getInstance()) : new BasicCameraApp(Txt.getInstance());
    }

    private PhoneCameraApp getCameraAppFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt (t), email (e), or social media (s)?");
        String share = scanner.next();
        scanner.close();

        switch (share) {
            case ("t"):
                return new CameraPlusApp(Txt.getInstance());
            case ("e"):
                return new CameraPlusApp(Email.getInstance());
            case ("s"):
                return new CameraPlusApp(Social.getInstance());
            default:
                return new CameraPlusApp(Txt.getInstance());
        }
    }

}