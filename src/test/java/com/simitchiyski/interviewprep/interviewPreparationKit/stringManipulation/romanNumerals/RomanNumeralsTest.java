package com.simitchiyski.interviewprep.interviewPreparationKit.stringManipulation.romanNumerals;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RomanNumeralsTest {

    private static final String MCMLXXVI = "MCMLXXVI";
    private static final int numSets = 5;
    private static final int numReps = 3;

    @Test
    public void isRomanNumeralSlow() {
        System.out.println("Start isRomanNumeralSlow...");

        boolean b = false;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < numReps; j++) {
                b ^= RomanNumerals.isRomanNumeralSlow(MCMLXXVI);
            }
            long end = System.nanoTime();
            System.out.println(((end - start) / (1_000. * numReps)) + " μs.");
        }

        // Prevents VM from optimizing away everything.
        if (!b)
            System.out.println();

        System.out.println("End isRomanNumeralSlow...");
    }

    @Test
    public void isRomanNumeralFast() {
        System.out.println("Start isRomanNumeralFast...");

        boolean b = false;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < numReps; j++) {
                b ^= RomanNumerals.isRomanNumeralSlow(MCMLXXVI);
            }
            long end = System.nanoTime();
            System.out.println(((end - start) / (1_000. * numReps)) + " μs.");
        }

        // Prevents VM from optimizing away everything.
        if (!b)
            System.out.println();

        System.out.println("End isRomanNumeralFast...");
    }

    // Not quite accurate
    @Test
    public void fastVsSlow() {
        long isRomanNumeralSlowStart = System.nanoTime();
        RomanNumerals.isRomanNumeralFast(MCMLXXVI);
        long isRomanNumeralSlowEnd = System.nanoTime();

        long isRomanNumeralFastStart = System.nanoTime();
        RomanNumerals.isRomanNumeralFast(MCMLXXVI);
        long isRomanNumeralFastEnd = System.nanoTime();

        assertTrue((isRomanNumeralFastEnd - isRomanNumeralFastStart) < (isRomanNumeralSlowEnd - isRomanNumeralSlowStart));
    }
}