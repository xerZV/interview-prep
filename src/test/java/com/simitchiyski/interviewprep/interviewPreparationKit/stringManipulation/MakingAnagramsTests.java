package com.simitchiyski.interviewprep.interviewPreparationKit.stringManipulation;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.stringManipulation.makingAnagrams.MakingAnagrams.makeAnagram;
import static org.junit.Assert.assertEquals;

public class MakingAnagramsTests {
    @Test
    public void testcountingValleys() {
        assertEquals(4, makeAnagram("cde", "abc"));
        assertEquals(2, makeAnagram("showman", "woman"));
        assertEquals(1, makeAnagram("aabd", "abd"));
        assertEquals(30, makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}
