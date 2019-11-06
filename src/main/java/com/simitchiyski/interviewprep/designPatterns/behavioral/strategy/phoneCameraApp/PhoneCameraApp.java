package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.phoneCameraApp;

public abstract class PhoneCameraApp {
    private final ShareStrategy shareStrategy;

    protected PhoneCameraApp(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void share() {
        this.shareStrategy.share();
    }

    public void take() {
        System.out.println("Taking the photo");
    }

    public void save() {
        System.out.println("Saving the photo");
    }

    public abstract void edit();
}
