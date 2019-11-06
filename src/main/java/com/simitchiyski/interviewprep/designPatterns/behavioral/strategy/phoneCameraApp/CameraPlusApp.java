package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.phoneCameraApp;

public class CameraPlusApp extends PhoneCameraApp {
    public CameraPlusApp(ShareStrategy shareStrategy) {
        super(shareStrategy);
    }

    @Override
    public void edit() {
        System.out.println("Extra snazzy photo editing features");
    }
}
