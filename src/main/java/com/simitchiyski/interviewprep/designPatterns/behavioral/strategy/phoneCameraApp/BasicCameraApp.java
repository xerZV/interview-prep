package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.phoneCameraApp;

public class BasicCameraApp extends PhoneCameraApp {
    public BasicCameraApp(ShareStrategy shareStrategy) {
        super(shareStrategy);
    }

    @Override
    public void edit() {
        System.out.println("Basic editing features");
    }
}
