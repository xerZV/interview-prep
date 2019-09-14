package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.leftRoration;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.simitchiyski.interviewprep.interviewPreparationKit.arrays.leftRoration.LeftRotation.rotLeft;
import static org.junit.Assert.assertEquals;

public class LeftRotationTests {
    private int sampleArray[] = new int[]{1, 2, 3, 4, 5};
    private int expected[] = new int[]{5, 1, 2, 3, 4};
    private int rotation = 4;

    @Test
    public void testHourglassSum() {
        assertEquals("5 1 2 3 4", Arrays.stream(rotLeft(sampleArray, rotation)).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        assertEquals("5 4 3 2 1", Arrays.stream(rotLeft(sampleArray, 5)).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
