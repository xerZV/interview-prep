package com.simitchiyski.interviewprep.interviewPreparationKit.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    private static Stack stack;

    @Before
    public void before() {
        stack = new Stack();
    }

    @Test
    public void push() {
        stack.push("String");
        assertEquals(1, stack.size());
    }

    @Test
    public void pop() {
        stack.push("String");
        stack.push("String2");

        stack.pop();
        assertEquals(1, stack.size());
    }
}