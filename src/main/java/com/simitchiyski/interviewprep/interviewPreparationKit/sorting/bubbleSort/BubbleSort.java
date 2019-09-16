package com.simitchiyski.interviewprep.interviewPreparationKit.sorting.bubbleSort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class BubbleSort {
    private BubbleSort() {
    }

    public static Integer[] generateArrayWithNRandomNumbers(int n) {
        return new Random().ints(n, -100, 100).boxed().toArray(Integer[]::new);
    }

    // O(n^2), or maybe worse
    private static int sort(Integer[] array, Predicate<Integer> orderType) {
        AtomicInteger swapCount = new AtomicInteger();

        int length = array.length;
        IntStream.range(0, length - 1)
                .flatMap(i -> IntStream.range(1, length - i))
                .forEach(j -> {
                    if (orderType.test(j)) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                        swapCount.getAndIncrement();
                    }
                });

        return swapCount.get();
    }

    public static int sort(Integer[] array, OrderType orderType) {
        if (orderType.equals(OrderType.ASCENDING) || orderType == null)
            return sort(array, i -> array[i - 1] > array[i]);

        return sort(array, i -> array[i - 1] < array[i]);
    }

    public static void sortAndPrint(Integer[] array, OrderType orderType) {
        int swapCount = sort(array, orderType != null ? orderType : OrderType.ASCENDING);
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        print(array, orderType);
    }

    // Maybe O(n^2) in the worst case, O(n) in the best case. But it's faster than the stream implementation, because
    // there is break statement and will sometimes will skip
    private static int optimizedSort(Integer[] array, Predicate<Integer> orderType) {
        int i = 0, length = array.length;
        AtomicInteger swapCount = new AtomicInteger();

        boolean swapNeeded = true;
        while (i < length - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < length - i; j++) {
                if (orderType.test(j)) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapCount.getAndIncrement();
                    swapNeeded = true;
                }
            }

            if (!swapNeeded) {
                break;
            }

            i++;
        }

        return swapCount.get();
    }

    public static int optimizedSort(Integer[] array, OrderType orderType) {
        if (orderType.equals(OrderType.ASCENDING) || orderType == null)
            return optimizedSort(array, i -> array[i - 1] > array[i]);

        return optimizedSort(array, i -> array[i - 1] < array[i]);
    }

    public static void optimizedSortAndPrint(Integer[] array, OrderType orderType) {
        int swapCount = optimizedSort(array, orderType != null ? orderType : OrderType.ASCENDING);
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        print(array, orderType);
    }

    private static void print(Integer[] array, OrderType orderType) {
        if (array != null)
            System.out.println(toString(array, orderType));
    }

    public static void print(Integer[] array) {
        if (array != null)
            System.out.println(toString(array));
    }

    public static String toString(Integer[] array) {
        return "[" + Arrays.stream(array).map(integer -> integer.toString()).collect(Collectors.joining(", ")) + "]";
    }

    public static String toString(Integer[] array, OrderType orderType) {
        return "[" + Arrays.stream(array).map(integer -> integer.toString()).collect(Collectors.joining(", ")) + "] " + orderType.getTypeCode();
    }

    static enum OrderType {
        ASCENDING("ASC"),
        DESCENDING("DESC");

        private String typeCode;

        OrderType(String typeCode) {
            this.typeCode = typeCode;
        }

        public static OrderType getSortTypeByCode(final String typeCode) {
            for (OrderType orderType : values()) {
                if (orderType.getTypeCode().equalsIgnoreCase(typeCode))
                    return orderType;
            }

            return ASCENDING;
        }

        public String getTypeCode() {
            return this.typeCode;
        }
    }
}
