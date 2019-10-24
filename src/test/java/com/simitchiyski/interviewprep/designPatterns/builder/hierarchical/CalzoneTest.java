package com.simitchiyski.interviewprep.designPatterns.builder.hierarchical;

import org.junit.Test;

import static com.simitchiyski.interviewprep.designPatterns.builder.hierarchical.Pizza.Topping.HAM;
import static org.junit.Assert.assertEquals;

public class CalzoneTest {
    private static final String EXPECTED_RESULT = "Calzone{sauceInside=true, toppings=[HAM]}";

    @Test
    public void builder() {
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();

        assertEquals(EXPECTED_RESULT, calzone.toString());
        System.out.println("expected=" + EXPECTED_RESULT);
        System.out.println("result=" + calzone);
    }

}