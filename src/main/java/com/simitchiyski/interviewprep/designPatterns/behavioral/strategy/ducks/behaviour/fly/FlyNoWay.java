package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.fly;

public final class FlyNoWay implements FlyBehavior {
    private static final FlyNoWay INSTANCE = new FlyNoWay();

    private FlyNoWay() {
    }

    public static FlyNoWay getInstance() {
        return INSTANCE;
    }

    public void fly() {
        System.out.println("I can't fly");
    }
}
