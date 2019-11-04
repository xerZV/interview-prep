package com.simitchiyski.interviewprep.designPatterns.creational.singleton.staticfactory;

public class LazyFactorySingleton {
    private static LazyFactorySingleton INSTANCE = null;

    private LazyFactorySingleton() {
    }

    public static LazyFactorySingleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new LazyFactorySingleton();

        return INSTANCE;
    }

    public String sayHello() {
        return "Hello";
    }
}
