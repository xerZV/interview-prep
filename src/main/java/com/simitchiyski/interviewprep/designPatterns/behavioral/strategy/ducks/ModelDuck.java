package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks;

import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.fly.FlyNoWay;
import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.quack.Quack;

public final class ModelDuck extends Duck {

    public ModelDuck() {
        super(FlyNoWay.getInstance(), Quack.getInstance());
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
