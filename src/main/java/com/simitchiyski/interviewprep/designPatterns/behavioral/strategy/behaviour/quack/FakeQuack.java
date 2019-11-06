package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.quack;

public final class FakeQuack implements QuackBehavior {
    private static final FakeQuack INSTANCE = new FakeQuack();

    private FakeQuack() {
    }

    public static FakeQuack getInstance() {
        return INSTANCE;
    }

    public void quack() {
        System.out.println("Qwak");
    }
}
