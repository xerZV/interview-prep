package com.simitchiyski.interviewprep.interviewPreparationKit.sorting.bubbleSort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static com.simitchiyski.interviewprep.interviewPreparationKit.sorting.bubbleSort.BubbleSort.OrderType;
import static org.junit.Assert.assertEquals;

public class BubbleSortTests {
    private Integer[] arr;

    @Before
    public void beforeEachTest() {
        this.arr = BubbleSort.generateArrayWithNRandomNumbers(20);
    }

    @Test
    public void testBubleSortStream() {
        System.out.println("Original state:");
        BubbleSort.print(arr);
        BubbleSort.sortAndPrint(arr, OrderType.ASCENDING);
        System.out.println();
        BubbleSort.sortAndPrint(arr, OrderType.DESCENDING);

        System.out.println();
        arr = new Integer[]{1, 5, 2, 6, -4};
        assertEquals(Integer.valueOf(5), Integer.valueOf(BubbleSort.sort(arr, OrderType.ASCENDING)));
        assertEquals("[-4, 1, 2, 5, 6]", BubbleSort.toString(arr));
    }

    @Test
    public void testBubleSortWhileStatement() {
        System.out.println("Original state:");
        BubbleSort.print(arr);
        BubbleSort.optimizedSortAndPrint(arr, OrderType.ASCENDING);
        System.out.println();
        BubbleSort.optimizedSortAndPrint(arr, OrderType.DESCENDING);

        System.out.println();
        arr = new Integer[]{1, 5, 2, 6, -4};
        assertEquals(Integer.valueOf(5), Integer.valueOf(BubbleSort.optimizedSort(arr, OrderType.ASCENDING)));
        assertEquals("[-4, 1, 2, 5, 6]", BubbleSort.toString(arr));
        assertEquals(Integer.valueOf(10), Integer.valueOf(BubbleSort.optimizedSort(arr, OrderType.DESCENDING)));
        assertEquals("[6, 5, 2, 1, -4]", BubbleSort.toString(arr));
    }


    @Test
    public void littleHomemadeBenchmark() {
        warmups(3);

        testLambdaVsOptimized(10, 20_000);
    }

    //TODO do it correctly with org.openjdk.jmh
    private void testLambdaVsOptimized(int benchmarkIteration, int howManyNumbers) {
        System.out.println("Test lambda bubble sort vs optimized bubble sort");
        System.out.println("Will perform iterations=" + benchmarkIteration + ", each with array[" + howManyNumbers + "]");
        Integer[] arr = BubbleSort.generateArrayWithNRandomNumbers(howManyNumbers);

        long avgLambda = 0L;
        long avgOptimized = 0L;

        for (int i = 0; i < benchmarkIteration; i++) {
            System.out.println("Benchmark iterate: " + i);
            Integer[] arrForOptimized = Arrays.copyOf(arr, arr.length);
            long start = System.currentTimeMillis();
            BubbleSort.optimizedSort(arrForOptimized, OrderType.ASCENDING);
            avgOptimized += System.currentTimeMillis() - start;

            Integer[] arrForLambda = Arrays.copyOf(arr, arr.length);
            start = System.currentTimeMillis();
            BubbleSort.sort(arrForLambda, OrderType.ASCENDING);
            avgLambda += System.currentTimeMillis() - start;
        }

        System.out.format("Avg sort time for lambda: %.2f seconds", (((avgLambda / benchmarkIteration) / 10.0)) / 1000.0);
        System.out.println();
        System.out.format("Avg sort time for optimized: %.2f seconds", (((avgOptimized / benchmarkIteration) / 10.0)) / 1000.0);
        System.out.println();
    }

    private void warmups(int warmups) {
        System.out.println("Warming the JVM with iterations=: " + warmups + ", each with 2000 elements");

        Integer[] arr = BubbleSort.generateArrayWithNRandomNumbers(2000);
        for (int j = 0; j < warmups; j++) {
            BubbleSort.sort(arr, OrderType.DESCENDING);
            BubbleSort.optimizedSort(arr, OrderType.ASCENDING);
        }
    }
}
