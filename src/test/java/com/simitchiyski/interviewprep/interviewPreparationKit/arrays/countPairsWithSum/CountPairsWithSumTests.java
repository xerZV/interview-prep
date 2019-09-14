package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.countPairsWithSum;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.arrays.countPairsWithSum.CountPairsWithSum.countPairsWithSumBHashSet;
import static com.simitchiyski.interviewprep.interviewPreparationKit.arrays.countPairsWithSum.CountPairsWithSum.countPairsWithSumBruteForce;
import static org.junit.Assert.assertEquals;

public class CountPairsWithSumTests {

    @Test
    public void testCountPairsWithSumBruteForce() {
        int[] array = new int[]{1, 7, 7, 1}; // 4
        assertEquals(Integer.valueOf(4), Integer.valueOf(countPairsWithSumBruteForce(array, 8)));

        array = new int[]{1, 2, 7, 8, 11, 3, -3};
        assertEquals(Integer.valueOf(2), Integer.valueOf(countPairsWithSumBruteForce(array, 8)));

        array = new int[]{0, 14, 0, 4, 7, 8, 3, 5, 7};
        assertEquals(Integer.valueOf(3), Integer.valueOf(countPairsWithSumBruteForce(array, 11)));
    }

    @Test
    public void testCountPairsWithSumHashSet() {
        int[] array = new int[]{1, 7, 7, 1}; // 2, because we are using Set
        assertEquals(Integer.valueOf(2), Integer.valueOf(countPairsWithSumBHashSet(array, 8)));

        array = new int[]{1, 2, 7, 8, 11, 3, -3};
        assertEquals(Integer.valueOf(2), Integer.valueOf(countPairsWithSumBHashSet(array, 8)));

        array = new int[]{0, 14, 0, 4, 7, 8, 3, 5, 7};
        assertEquals(Integer.valueOf(3), Integer.valueOf(countPairsWithSumBHashSet(array, 11)));
    }
}
