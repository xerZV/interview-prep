package com.simitchiyski.interviewprep.interviewPreparationKit.arrays.newYearChaos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NewYearChaos {

    private static final String TOO_CHAOTIC = "Too chaotic";

    public static String minimumBribes(int[] q) {
        int bribes = 0;
        List<Integer> target = Arrays.stream(q).sorted().boxed().collect(Collectors.toCollection(LinkedList::new));
        for (int number : q) {
            int index = target.indexOf(number);

            if (index >= 3) {
                return TOO_CHAOTIC;
            }

            bribes += index;
            target.remove(index);
        }

        return String.valueOf(bribes);
    }

    public static String minimumBribesOptimized(int[] q) {
        int bribes = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                return TOO_CHAOTIC;
            }

            for (int j = Math.max(0, q[i] - 1 - 1); j < i; j++) { // but why and HOW?
                if (q[j] > q[i])
                    bribes++;
            }
        }

        return String.valueOf(bribes);
    }

    //need improvements
    public static String minimumBribesDenny(int[] q) {
        int bribes = 0;
        for (int i = 1; i <= q.length; i++) {
            if (q[i - 1] - i > 2) {
                return TOO_CHAOTIC;
            } else if (q[i - 1] - i > 0) {
                int currentNumber = q[i - 1];
                int diff = q[i - 1] - i;
                bribes += diff;
            } else if (q[i - 1] - i < 0) {
                int currentNumber = q[i - 1];
                int diff = q[i - 1] - i;
                if (q.length - i >= 1) {
                    int nextDif = q[i] - (i + 1);
                    if ((diff < 0 && nextDif < 0) && nextDif < diff) {
                        bribes++;
                    }
                }
            }
        }

        return String.valueOf(bribes);
    }
}
