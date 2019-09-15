package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.swapMinMax;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.simitchiyski.interviewprep.interviewPreparationKit.arrays.swapMinMax.SwapMinMax.swapMinMax;
import static org.junit.Assert.assertEquals;

public class SwapMinMaxTests {
    private static final String ORIGINAL = "1, 2, 5, 3, 7, 4, 99, 56, 101";
    private static final String EXPECTED = "101, 2, 5, 3, 7, 4, 99, 56, 1";

    @Test
    public void testSwapMinMax() {
        int[] array = new int[]{1, 2, 5, 3, 7, 4, 99, 56, 101};

        swapMinMax(array);

        assertEquals(EXPECTED, Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    }
}
