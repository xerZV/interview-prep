package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.quack;

public final class MuteQuack implements QuackBehavior {
    private static final MuteQuack INSTANCE = new MuteQuack();

    private MuteQuack() {
    }

    public static MuteQuack getInstance() {
        return INSTANCE;
    }

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
