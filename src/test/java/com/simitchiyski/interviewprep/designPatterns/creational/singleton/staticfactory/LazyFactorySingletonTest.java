package com.simitchiyski.interviewprep.designPatterns.creational.singleton.staticfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LazyFactorySingletonTest {

    private static final String HELLO = "Hello";

    @Test
    public void sayHello() {
        LazyFactorySingleton lazyFactorySingletonInstance = LazyFactorySingleton.getInstance();
        assertEquals(HELLO, lazyFactorySingletonInstance.sayHello());
        System.out.println(lazyFactorySingletonInstance.sayHello());
    }
}