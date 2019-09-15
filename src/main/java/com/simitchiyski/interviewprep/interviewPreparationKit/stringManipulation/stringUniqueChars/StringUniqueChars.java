package com.simitchiyski.interviewprep.interviewPreparationKit.stringManipulation.stringUniqueChars;

public class StringUniqueChars {
    //The basic ASCII set uses 7 bits for each character, giving it a total of 128 unique symbols.
    private static int ASCII_TOTAL_SYMBOLS = 128;

    // The time complexity for this code is O(N)
    // The space complexity is O(l)
    // Can assume the time complexity is 0(1), since the for loop will never iterate through more than
    // 128 characters
    public static boolean isUniqueChars(final String toCheck) {
        if (toCheck.length() > ASCII_TOTAL_SYMBOLS)
            return false;

        boolean[] chars = new boolean[ASCII_TOTAL_SYMBOLS];
        for (int i = 0; i < toCheck.length(); i++) {
            if (chars[toCheck.charAt(i)])
                return false;

            chars[toCheck.charAt(i)] = true;
        }

        return true;
    }
}
