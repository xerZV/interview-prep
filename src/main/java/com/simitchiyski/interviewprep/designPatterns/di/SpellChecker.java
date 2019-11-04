package com.simitchiyski.interviewprep.designPatterns.di;

import java.util.List;
import java.util.Objects;

public class SpellChecker {
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return this.dictionary.isValid(word);
    }

    public List<String> suggestions(String typo) {
        return this.dictionary.suggestions(typo);
    }
}
