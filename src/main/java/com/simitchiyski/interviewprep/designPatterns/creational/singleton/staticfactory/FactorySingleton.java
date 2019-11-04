package com.simitchiyski.interviewprep.designPatterns.creational.singleton.staticfactory;

public class FactorySingleton {
    private static final FactorySingleton INSTANCE = new FactorySingleton();

    private FactorySingleton() {
    }

    // Advantage of the static factory approach	is that	it gives you the flexibility to change your mind about whether
    // the class is	a singleton without changing its API. The factory method returns the sole instance,
    // but it could be modified to return, say, a separate instance for each thread that invokes it.
    // A second	advantage is that you can write	a generic singleton factory	if your application	requires it.
    // A final advantage of	using a static factory is that a method	reference can be used as a supplier,
    // for example Elvis::instance is a	Supplier<Elvis>.
    // Unless one of these advantages is relevant, the public field	approach is	preferable.
    public static FactorySingleton getInstance() {
        return INSTANCE;
    }

    public String sayHello() {
        return "Hello";
    }
}
