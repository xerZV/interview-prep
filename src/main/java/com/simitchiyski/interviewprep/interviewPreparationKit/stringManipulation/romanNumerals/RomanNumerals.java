package com.simitchiyski.interviewprep.interviewPreparationKit.stringManipulation.romanNumerals;

import java.util.regex.Pattern;

// Reusing expensive object for improved performance
public class RomanNumerals {
    // Reusing expensive object for improved performance
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    // Performance can be greatly improved!
    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }
}
