package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.phoneCameraApp;

public class Email implements ShareStrategy {
    private static final Email INSTANCE = new Email();

    private Email() {
    }

    public static Email getInstance() {
        return INSTANCE;
    }

    public void share() {
        System.out.println("I'm emailing the photo");
    }
}
