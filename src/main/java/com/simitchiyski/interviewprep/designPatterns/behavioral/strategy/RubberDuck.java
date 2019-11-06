package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy;

import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.fly.FlyNoWay;
import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.quack.FakeQuack;

public final class RubberDuck extends Duck {

    public RubberDuck() {
        super(FlyNoWay.getInstance(), FakeQuack.getInstance());
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
