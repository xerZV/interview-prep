package com.simitchiyski.interviewprep.interviewPreparationKit.stringManipulation;

import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.stringManipulation.stringUniqueChars.StringUniqueChars.isUniqueChars;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUniqueCharsTests {

    @Test
    public void testIsUniqueChars() {
        assertFalse(isUniqueChars("Tokyo"));
        assertTrue(isUniqueChars("Iran"));
        assertTrue(isUniqueChars("Nikolay"));
        assertFalse(isUniqueChars("Pesho pEshev"));
    }
}
