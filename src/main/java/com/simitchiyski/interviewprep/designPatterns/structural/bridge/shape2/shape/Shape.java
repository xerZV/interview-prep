package com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.shape;

import com.simitchiyski.interviewprep.designPatterns.structural.bridge.shape2.color.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
