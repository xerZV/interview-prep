package com.simitchiyski.interviewprep.designPatterns.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SandwichTest {

    @Test
    public void make() {
        assertEquals("Bread + turkey + mustard", new DressingDecorator(new MeatDecorator(new SimpleSandwich())).make());
        System.out.println(new DressingDecorator(new MeatDecorator(new SimpleSandwich())).make());
    }
}