package com.simitchiyski.interviewprep.designPatterns.builder.hierarchical;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// Builder pattern for class hierarchies
// Note that the underlying "simulated self-type" idiom  allows for arbitrary fluid hierarchies, not just builders
public abstract class Pizza {
    final Set<Topping> toppings;

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }
}
