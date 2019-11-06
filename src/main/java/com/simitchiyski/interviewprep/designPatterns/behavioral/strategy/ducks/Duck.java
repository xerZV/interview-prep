package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks;


import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.fly.FlyBehavior;
import com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks.behaviour.quack.QuackBehavior;

public abstract class Duck {
    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
