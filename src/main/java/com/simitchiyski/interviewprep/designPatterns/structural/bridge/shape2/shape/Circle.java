package com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.shape;

import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }

}
