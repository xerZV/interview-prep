package com.simitchiyski.interviewprep.interviewPreparationKit.warmUp.repeatedString;

public class RepeatedString {
    private static final char LOWER_CASE_CHAR_A = 'a';
    private static final String LOWER_CASE_STRING_A = "a";

    public static long repeatedString(String s, long n) {
        if (!s.contains(LOWER_CASE_STRING_A))
            return 0;
        else if (s.length() == 1)
            return n;

        long result = s.chars().filter(value -> (char) value == LOWER_CASE_CHAR_A).count() * (n / s.length());
        int remainder = (int) (n % s.length());

        if (remainder == 1 && s.charAt(0) == LOWER_CASE_CHAR_A) {
            result++;
        } else if (remainder > 1)
            result += s.substring(0, remainder).chars().filter(value -> (char) value == LOWER_CASE_CHAR_A).count();

        return result;
    }
}
