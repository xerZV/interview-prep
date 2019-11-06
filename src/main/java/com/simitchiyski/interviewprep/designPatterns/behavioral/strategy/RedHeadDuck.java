package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy;

import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.fly.FlyWithWings;
import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.quack.Quack;

public final class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super(FlyWithWings.getInstance(), Quack.getInstance());
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
