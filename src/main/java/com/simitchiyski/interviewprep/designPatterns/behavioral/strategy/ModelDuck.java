package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy;

import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.fly.FlyNoWay;
import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.behaviour.quack.Quack;

public final class ModelDuck extends Duck {

    public ModelDuck() {
        super(FlyNoWay.getInstance(), Quack.getInstance());
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
