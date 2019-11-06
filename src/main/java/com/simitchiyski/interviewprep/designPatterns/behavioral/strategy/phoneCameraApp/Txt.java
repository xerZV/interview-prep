package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.phoneCameraApp;

public class Txt implements ShareStrategy {

    private static final Txt INSTANCE = new Txt();

    private Txt() {
    }

    public static Txt getInstance() {
        return INSTANCE;
    }

    public void share() {
        System.out.println("I'm txting the photo");
    }
}
