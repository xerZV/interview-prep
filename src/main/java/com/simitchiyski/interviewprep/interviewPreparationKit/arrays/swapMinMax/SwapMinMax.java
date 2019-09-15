package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.swapMinMax;

import java.util.function.BiPredicate;

public class SwapMinMax {

    // This will take O(N) time. The fact that we iterate through the array twice doesn't matter.
    // based on CrackingTheCode, page 46, Example 1
    public static void swapMinMax(int[] array) {
        swap(array, getIndex(array, (arrVal, min) -> arrVal < min), getIndex(array, (arrVal, max) -> arrVal > max));
    }

    private static void swap(int[] array, int minIndex, int maxIndex) {
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }

    private static int getIndex(int[] array, BiPredicate<Integer, Integer> condition) {
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (condition.test(array[i], array[index]))
                index = i;
        }

        return index;
    }
}
