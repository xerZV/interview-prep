package com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.shape;

import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }

}
