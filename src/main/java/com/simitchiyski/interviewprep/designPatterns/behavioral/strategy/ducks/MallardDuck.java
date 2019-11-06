package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks;

import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.fly.FlyWithWings;
import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.quack.Quack;

public final class MallardDuck extends Duck {

    public MallardDuck() {
        super(FlyWithWings.getInstance(), Quack.getInstance());
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
