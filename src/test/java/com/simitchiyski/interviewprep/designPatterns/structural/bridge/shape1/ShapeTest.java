package com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape1;

import org.junit.Test;

public class ShapeTest {

    @Test
    public void applyColor() {
        //Its working but cannot expand with us, cannot grow with us
        // What about if we have to create another shape, for example rectangle and we want to have 5 colors on it?
        // Look at shape2 example which expands this example using Bridge
        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}