package com.simitchiyski.interviewprep.interviewPreparationKit.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

// Can you spot the "memory leak"?
public class Stack {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private Object[] elements;
    private int size = 0;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        this.ensureCapacity();

        this.elements[size++] = e;
    }

    /**
     * Corrected version of pop method
     */
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();

        Object result = this.elements[--this.size];
        this.elements[this.size] = null; // Eliminate obsolete reference

        return result;
    }

    /**
     * Can cause "memory leak"?
     */
    public Object popCausesLeak() {
        if (size == 0)
            throw new EmptyStackException();

        return this.elements[--this.size];
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (this.elements.length == this.size)
            this.elements = Arrays.copyOf(this.elements, 2 * this.size + 1);
    }

    public int size() {
        return this.size;
    }
}
