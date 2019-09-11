package com.simitchiyski.interviewprep.interviewPreparationKit.stringManipulation.makingAnagrams;

import java.util.Arrays;

public class MakingAnagrams {
    public static int makeAnagram(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a.length() == 0 ? b.length() : a.length();
        }

        final int[] lettersCount = new int[26];

        a.chars().forEach(value -> lettersCount[value - 'a']++);
        b.chars().forEach(value -> lettersCount[value - 'a']--);

        return Arrays.stream(lettersCount).map(Math::abs).sum();
    }

}
