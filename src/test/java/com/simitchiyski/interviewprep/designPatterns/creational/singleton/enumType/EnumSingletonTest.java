package com.simitchiyski.interviewprep.designPatterns.creational.singleton.enumType;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumSingletonTest {

    private static final String HELLO = "Hello";

    @Test
    public void sayHello() {
        EnumSingleton enumSingletonInstance = EnumSingleton.INSTANCE;
        assertEquals(HELLO, enumSingletonInstance.sayHello());
        System.out.println(enumSingletonInstance.sayHello());
    }
}