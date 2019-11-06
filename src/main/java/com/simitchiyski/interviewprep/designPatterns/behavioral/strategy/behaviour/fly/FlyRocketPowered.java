package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.fly;

public final class FlyRocketPowered implements FlyBehavior {
    private static final FlyRocketPowered INSTANCE = new FlyRocketPowered();

    private FlyRocketPowered() {
    }

    public static FlyRocketPowered getInstance() {
        return INSTANCE;
    }

    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
