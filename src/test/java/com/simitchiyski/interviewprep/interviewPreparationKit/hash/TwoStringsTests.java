package com.simitchiyski.interviewprep.interviewPreparationKit.hash;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.hash.twoStrings.TwoStrings.twoStrings;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoStringsTests {
    @Test
    public void testTwoStrings() {
        assertTrue(twoStrings("hello", "world"));
        assertTrue(twoStrings("hackerrankcommunity", "cdecdecdecde"));
        assertTrue(twoStrings("jackandjill", "wentupthehill"));
        assertFalse(twoStrings("hi", "world"));
        assertFalse(twoStrings("wouldyoulikefries", "abcabcabcabcabcabc"));
        assertFalse(twoStrings("writetoyourparents", "fghmqzldbc"));
    }
}
