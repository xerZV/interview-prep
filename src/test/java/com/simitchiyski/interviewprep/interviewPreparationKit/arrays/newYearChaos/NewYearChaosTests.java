package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.newYearChaos;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.arrays.newYearChaos.NewYearChaos.*;
import static org.junit.Assert.assertEquals;

public class NewYearChaosTests {
    @Test
    public void testMinimumBribes() {
        int[] queue = new int[]{2, 1, 5, 3, 4};
        assertEquals(String.valueOf(3), minimumBribes(queue));

        queue = new int[]{2, 5, 1, 3, 4};
        assertEquals("Too chaotic", minimumBribes(queue));

        queue = new int[]{5, 1, 2, 3, 7, 8, 6, 4};
        assertEquals("Too chaotic", minimumBribes(queue));

        queue = new int[]{1, 2, 5, 3, 4, 7, 8, 6};
        assertEquals(String.valueOf(4), minimumBribes(queue));

        queue = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        assertEquals(String.valueOf(7), minimumBribes(queue));

        queue = new int[]{1, 2, 3, 5, 4};
        assertEquals(String.valueOf(1), minimumBribes(queue));

    }

    @Test
    public void testMinimumBribesOptimized() {
        int[] queue = new int[]{2, 1, 5, 3, 4};
        assertEquals(String.valueOf(3), minimumBribesOptimized(queue));

        queue = new int[]{2, 5, 1, 3, 4};
        assertEquals("Too chaotic", minimumBribesOptimized(queue));

        queue = new int[]{5, 1, 2, 3, 7, 8, 6, 4};
        assertEquals("Too chaotic", minimumBribesOptimized(queue));

        queue = new int[]{1, 2, 5, 3, 4, 7, 8, 6};
        assertEquals(String.valueOf(4), minimumBribesOptimized(queue));

        queue = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        assertEquals(String.valueOf(7), minimumBribesOptimized(queue));

    }

    @Test
    public void testMinimumBribesDenny() {
        int[] queue = new int[]{2, 1, 5, 3, 4};
        assertEquals(String.valueOf(3), minimumBribesDenny(queue));

        queue = new int[]{2, 5, 1, 3, 4};
        assertEquals("Too chaotic", minimumBribesDenny(queue));

        queue = new int[]{5, 1, 2, 3, 7, 8, 6, 4};
        assertEquals("Too chaotic", minimumBribesDenny(queue));

        queue = new int[]{1, 2, 5, 3, 4, 7, 8, 6};
        assertEquals(String.valueOf(4), minimumBribesDenny(queue));

        queue = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        assertEquals(String.valueOf(7), minimumBribesDenny(queue));

    }


}
