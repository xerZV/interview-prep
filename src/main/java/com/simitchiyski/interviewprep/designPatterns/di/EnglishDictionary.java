package com.simitchiyski.interviewprep.designPatterns.di;

import java.util.Arrays;
import java.util.List;

public class EnglishDictionary implements Dictionary {
    @Override
    public boolean isValid(String word) {
        return false;
    }

    @Override
    public List<String> suggestions(String typo) {
        return Arrays.asList("one", "two");
    }
}
