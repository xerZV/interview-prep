package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.hourglassSum2d;

public class HourglassSum {
    public static int hourglassSum(final int[][] arr) {
        int greatestSum = Integer.MIN_VALUE;

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                int currentHourGlassSum =
                        arr[row][column] + arr[row][column + 1] + arr[row][column + 2]
                                + arr[row + 1][column + 1]
                                + arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];

                if (currentHourGlassSum > greatestSum)
                    greatestSum = currentHourGlassSum;
            }
        }

        return greatestSum;
    }
}
