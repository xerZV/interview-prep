package com.simitchiyski.interviewprep.designPatterns.builder.hierarchical;

import org.junit.Test;

import static com.simitchiyski.interviewprep.designPatterns.builder.hierarchical.NyPizza.Size.SMALL;
import static com.simitchiyski.interviewprep.designPatterns.builder.hierarchical.Pizza.Topping.ONION;
import static com.simitchiyski.interviewprep.designPatterns.builder.hierarchical.Pizza.Topping.SAUSAGE;
import static org.junit.Assert.assertEquals;

public class NyPizzaTest {
    private static final String EXPECTED_RESULT = "NyPizza{size=SMALL, toppings=[ONION, SAUSAGE]}";

    @Test
    public void builder() {
        NyPizza pizza = new NyPizza
                .Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        assertEquals(EXPECTED_RESULT, pizza.toString());
        System.out.println("expected=" + EXPECTED_RESULT);
        System.out.println("result=" + pizza);
    }

}