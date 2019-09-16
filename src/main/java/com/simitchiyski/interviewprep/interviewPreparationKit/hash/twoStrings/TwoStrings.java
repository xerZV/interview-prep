package com.simitchiyski.interviewprep.interviewPreparationKit.hash.twoStrings;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
    // Worst case O(N + M), where N=s.length()  and M=s2.length()
    public static boolean twoStrings(String s1, String s2) {
        Set<Character> chars = s1.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());
        for (Character ch : s2.toCharArray()) {
            if (chars.contains(ch))
                return true;
        }

        return false;
    }
}
