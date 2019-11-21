package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.singleNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {
    private static final int[] SAMPLE_INPUT_1 = new int[]{2, 2, 1};
    private static final int SAMPLE_EXPECTED_OUTPUT_1 = 1;

    private static final int[] SAMPLE_INPUT_2 = new int[]{4, 1, 2, 1, 2};
    private static final int SAMPLE_EXPECTED_OUTPUT_2 = 4;

    @Test
    public void signeNumber() {
        assertEquals(SAMPLE_EXPECTED_OUTPUT_1, SingleNumber.signeNumber(SAMPLE_INPUT_1));
        assertEquals(SAMPLE_EXPECTED_OUTPUT_2, SingleNumber.signeNumber(SAMPLE_INPUT_2));
    }

    @Test
    public void singleNumberUsingHashMap() {
        assertEquals(SAMPLE_EXPECTED_OUTPUT_1, SingleNumber.singleNumberUsingHashMap(SAMPLE_INPUT_1));
        assertEquals(SAMPLE_EXPECTED_OUTPUT_2, SingleNumber.singleNumberUsingHashMap(SAMPLE_INPUT_2));
    }
}