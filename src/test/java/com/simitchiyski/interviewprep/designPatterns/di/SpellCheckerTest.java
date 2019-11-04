package com.simitchiyski.interviewprep.designPatterns.di;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpellCheckerTest {
    private static final Dictionary spanishDictionary = new SpanishDictionary();
    private static final Dictionary englishDictionary = new EnglishDictionary();

    @Test
    public void spanishDictionary() {
        SpellChecker spanishSpellChecker = new SpellChecker(spanishDictionary);
        assertTrue(spanishSpellChecker.isValid("test"));
        assertEquals(1, spanishSpellChecker.suggestions("test").size());
    }

    @Test
    public void englishDictionary() {
        SpellChecker englishSpellChecker = new SpellChecker(englishDictionary);
        assertFalse(englishSpellChecker.isValid("test"));
        assertEquals(2, englishSpellChecker.suggestions("test").size());
    }
}

