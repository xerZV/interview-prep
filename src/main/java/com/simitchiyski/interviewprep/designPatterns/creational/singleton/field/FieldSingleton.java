package com.simitchiyski.interviewprep.designPatterns.creational.singleton.field;

// The main advantage of the public field approach is that the API makes it clear that the class is	a singleton:
// the public static field is final, so it will always contain the same object reference.
// The second advantage is that it’s simpler.
public class FieldSingleton {
    public static final FieldSingleton INSTANCE = new FieldSingleton();

    private FieldSingleton() {
    }

    public String sayHello() {
        return "Hello";
    }
}
