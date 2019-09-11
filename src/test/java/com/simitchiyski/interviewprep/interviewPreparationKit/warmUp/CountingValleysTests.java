package com.simitchiyski.interviewprep.interviewPreparationKit.warmUp;

import org.junit.BeforeClass;
import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.warmUp.countingValleys.CountingValleys.countingValleys;
import static org.junit.Assert.assertEquals;

public class CountingValleysTests {
    static int n = 8;
    static String s = "UDDDUDUU";

    @BeforeClass
    public static void beforeClass() {
        n = 8;
        s = "UDDDUDUU";
    }

    @Test
    public void testcountingValleys() {
        assertEquals(1, countingValleys(n, s));
        assertEquals(2, countingValleys(n, s + "UDDDUDUU"));
        assertEquals(3, countingValleys(n, s + "UDDDUDUU" + "DDDUUU"));
    }
}
