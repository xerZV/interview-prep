package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.countPairsWithSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class CountPairsWithSum {
    //O(n^2)
    public static int countPairsWithSumBruteForce(int[] array, final int sum) {
        int pairs = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum)
                    pairs++;
            }
        }

        return pairs;
    }

    // O(N), but it costs us space complexity
    public static int countPairsWithSumBHashSet(int[] array, final int sum) {
        Set<Integer> remainders = new HashSet<>(array.length);
        AtomicInteger pairs = new AtomicInteger();

        Arrays.stream(array).forEach(value -> {
            int remainder = sum - value;
            if (remainders.contains(remainder))
                pairs.getAndIncrement();
            else
                remainders.add(value);
        });

        return pairs.get();
    }
}
