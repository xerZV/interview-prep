package com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2;

import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Blue;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Color;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Green;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Red;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.shape.Circle;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.shape.Shape;
import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.shape.Square;

public class Shape2BridgeDemo {

    public static void main(String[] args) {
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
