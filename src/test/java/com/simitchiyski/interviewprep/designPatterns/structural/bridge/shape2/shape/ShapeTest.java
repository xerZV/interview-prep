package com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.shape;

import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Blue;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Color;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Green;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Red;
import org.junit.Test;

public class ShapeTest {

    @Test
    public void applyColor() {
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        Color green = new Green();

        Shape greenCircle = new Circle(green);

        Shape greenSquare = new Square(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
        greenSquare.applyColor();
    }
}