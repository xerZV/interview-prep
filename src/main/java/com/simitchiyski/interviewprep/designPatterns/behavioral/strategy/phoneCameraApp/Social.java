package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.phoneCameraApp;

public class Social implements ShareStrategy {
    private static final Social INSTANCE = new Social();

    private Social() {
    }

    public static Social getInstance() {
        return INSTANCE;
    }

    public void share() {
        System.out.println("I'm posting the photo on social media");
    }
}
