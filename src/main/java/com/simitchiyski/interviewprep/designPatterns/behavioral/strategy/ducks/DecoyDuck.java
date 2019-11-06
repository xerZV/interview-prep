package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks;

import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.fly.FlyNoWay;
import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.quack.MuteQuack;

public final class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(FlyNoWay.getInstance(), MuteQuack.getInstance());
    }

    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
