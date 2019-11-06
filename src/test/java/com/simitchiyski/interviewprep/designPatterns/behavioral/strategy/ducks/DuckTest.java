package com.simitchiyski.interviewprep.designPatterns.behavioral.strategy.ducks;

import org.junit.Test;

public class DuckTest {
    @Test
    public void testStrategy() {
        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        System.out.println();

        MallardDuck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        System.out.println();

        RubberDuck rubberDuckie = new RubberDuck();
        rubberDuckie.display();
        rubberDuckie.performFly();
        rubberDuckie.performQuack();
        System.out.println();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
    }

}