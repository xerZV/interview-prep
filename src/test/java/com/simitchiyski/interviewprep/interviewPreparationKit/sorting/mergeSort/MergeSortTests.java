package com.simitchiyski.interviewprep.interviewPreparationKit.sorting.mergeSort;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class MergeSortTests {
    @Test
    public void testMergeSort() {
        int[] arr = new int[]{9, 2, 6, 4, 3, 5, 1};

        MergeSort.sort(arr);

        assertEquals("1, 2, 3, 4, 5, 6, 9", Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    }
}
