package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.quack;

public final class Quack implements QuackBehavior {
    private static final Quack INSTANCE = new Quack();

    private Quack() {
    }

    public static Quack getInstance() {
        return INSTANCE;
    }

    public void quack() {
        System.out.println("Quack");
    }
}
