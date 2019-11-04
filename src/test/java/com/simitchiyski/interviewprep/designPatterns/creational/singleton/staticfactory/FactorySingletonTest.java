package com.simitchiyski.interviewprep.designPatterns.creational.singleton.staticfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorySingletonTest {

    private static final String HELLO = "Hello";

    @Test
    public void sayHello() {
        FactorySingleton factorySingletonInstance = FactorySingleton.getInstance();
        assertEquals(HELLO, factorySingletonInstance.sayHello());
        System.out.println(factorySingletonInstance.sayHello());
    }
}