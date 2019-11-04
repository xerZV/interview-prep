package com.simitchiyski.interviewprep.designPatterns.creational.singleton.field;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldSingletonTest {

    private static final String HELLO = "Hello";

    @Test
    public void sayHello() {
        FieldSingleton fieldSingletonInstance = FieldSingleton.INSTANCE;
        assertEquals(HELLO, fieldSingletonInstance.sayHello());
        System.out.println(fieldSingletonInstance.sayHello());
    }
}