package com.simitchiyski.interviewprep.designPatterns.structural.decorator;

public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Bread";
    }
}
