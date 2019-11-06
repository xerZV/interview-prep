package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.fly;

public final class FlyWithWings implements FlyBehavior {
    private static final FlyWithWings INSTANCE = new FlyWithWings();

    private FlyWithWings() {
    }

    public static FlyWithWings getInstance() {
        return INSTANCE;
    }

    public void fly() {
        System.out.println("I'm flying!!");
    }
}
