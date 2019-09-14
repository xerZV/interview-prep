package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.leftRoration;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LeftRotation {
    public static int[] rotLeft(int[] a, int d) {
        if (a == null || d < 0 || d > a.length)
            return null;

        if (d == a.length) { //if the number of rotations = a.length - reverse the array
            //create stream with ints from 0 to a.lenght and then map (get) the element from a with index i
            return IntStream.range(0, a.length).map(i -> a[a.length - i - 1]).toArray();
        }

        return Stream.of(Arrays.copyOfRange(a, d, a.length), Arrays.copyOfRange(a, 0, d)).flatMapToInt(IntStream::of).toArray();
    }
}
