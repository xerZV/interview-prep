package com.simitchiyski.interviewprep.designPatterns.structural.flyweight;

//Instances of Item will be the Flyweights
class Item {
    private final String name;

    Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}