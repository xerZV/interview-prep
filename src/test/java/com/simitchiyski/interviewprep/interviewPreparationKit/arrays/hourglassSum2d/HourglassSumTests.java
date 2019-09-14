package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.hourglassSum2d;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.arrays.hourglassSum2d.HourglassSum.hourglassSum;
import static org.junit.Assert.assertEquals;

public class HourglassSumTests {

    @Test
    public void testHourglassSum() {
        int sample2dArray[][] = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        assertEquals(Integer.valueOf(19), Integer.valueOf(hourglassSum(sample2dArray)));

        sample2dArray = new int[][]{
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        assertEquals(Integer.valueOf(28), Integer.valueOf(hourglassSum(sample2dArray)));

    }
}
