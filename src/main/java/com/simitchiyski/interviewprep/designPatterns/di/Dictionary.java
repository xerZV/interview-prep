package com.simitchiyski.interviewprep.designPatterns.di;

import java.util.List;

public interface Dictionary {
    boolean isValid(String word);

    List<String> suggestions(String typo);
}
