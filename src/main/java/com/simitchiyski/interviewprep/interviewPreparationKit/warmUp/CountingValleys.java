package com.simitchiyski.interviewprep.interviewPreparationKit.warmUp;

public class CountingValleys {
    private static final char DOWN = 'D';
    private static final char UP = 'U';

    static int countingValleys(int n, String s) {
        int seaLevel = 0, currentLevel = 0, count = 0;

        boolean isDownhill = false;
        for (Character c : s.toCharArray()) {
            if (c == DOWN) {
                currentLevel--;
            } else {
                currentLevel++;
                if (isDownhill && currentLevel == seaLevel){
                    count++;
                    isDownhill=false;
                }
            }

            if (currentLevel < seaLevel){
                isDownhill = true;
            }
        }

        return count;
    }
}
