package com.simitchiyski.interviewprep.designPatterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NutritionFactsTest {
    private static final String EXPECTED_BUILDER_RESULT = "NutritionFacts{servingSize=330, servings=1, calories=670, fat=50, sodium=40, carbohydrate=0}";

    @Test
    public void of() {
        String result = NutritionFacts.of(330, 1)
                .calories(670)
                .sodium(40)
                .fat(50)
                .build().toString();

        assertEquals(EXPECTED_BUILDER_RESULT, result);
        System.out.println("expected=" + EXPECTED_BUILDER_RESULT);
        System.out.println("result=" + result);
    }
}