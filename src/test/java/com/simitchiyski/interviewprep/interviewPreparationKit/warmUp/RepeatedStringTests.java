package com.simitchiyski.interviewprep.interviewPreparationKit.warmUp;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.warmUp.RepeatedString.repeatedString;
import static org.junit.Assert.assertEquals;

public class RepeatedStringTests {

    @Test
    public void testRepeatedString() {
        assertEquals(7, repeatedString("aba", 10L));
        assertEquals(1000000000000L, repeatedString("a", 1000000000000L));
        assertEquals(7, repeatedString("abaa", 10L));
        assertEquals(8, repeatedString("abbaa", 14L));
        assertEquals(241753848483L, repeatedString("bab", 725261545450L));
    }

}
