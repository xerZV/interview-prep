package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.singleNumber;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SingleNumber {

    // linear runtime complexity and without using extra memory
    public static int signeNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int singleNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }

        return singleNumber;
    }

    public static int singleNumberUsingHashMap(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Optional<Map.Entry<Integer, Long>> result = Arrays
                .stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1).findFirst();

        if (result.isPresent())
            return result.get().getKey();

        return -1;
    }
}
