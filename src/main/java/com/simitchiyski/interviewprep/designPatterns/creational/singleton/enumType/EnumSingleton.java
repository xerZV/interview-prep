package com.simitchiyski.interviewprep.designPatterns.creational.singleton.enumType;

// This approach is similar to the public field approach, but it is more concise, provides the serialization machinery
// for free, and provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated
// serialization or reflection attacks. This approach may feel a bit unnatural,
// but a single-element enum type is often the best way to implement a singleton
public enum EnumSingleton {
    INSTANCE;

    public String sayHello() {
        return "Hello";
    }
}
