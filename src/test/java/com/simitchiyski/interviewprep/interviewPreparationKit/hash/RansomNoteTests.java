package com.simitchiyski.interviewprep.interviewPreparationKit.hash;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.hash.ransomNote.RansomNote.checkMagazine;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RansomNoteTests {
    @Test
    public void testRansomNote() {
        assertTrue(checkMagazine(new String[]{"give", "me", "one", "grand", "today", "night"}, new String[]{"give", "one", "grand", "today"}));
        assertFalse(checkMagazine(new String[]{"two", "times", "three", "is", "not", "four"}, new String[]{"two", "times", "two", "is", "four"}));
        assertFalse(checkMagazine(new String[]{"one", "me", "one", "one", "today", "one"}, new String[]{"give", "one", "grand", "today"}));
    }
}
