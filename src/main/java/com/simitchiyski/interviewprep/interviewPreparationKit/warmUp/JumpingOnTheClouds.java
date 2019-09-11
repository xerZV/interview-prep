package com.simitchiyski.interviewprep.interviewPreparationKit.warmUp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JumpingOnTheClouds {
    static int jumpingOnCloudsBruteForce(int[] c) {
        List<Integer> integers = Arrays.stream(c).boxed().collect(Collectors.toList());
        LinkedList<Integer> m = new LinkedList<>();
        int last1Index = integers.lastIndexOf(1);
        int lastZerosCount = c.length - 1 - last1Index;

        int count = 0;

        for (int i = 0; i <= last1Index; i++) {
            int cloud = c[i];

            if (cloud == 0) {
                m.add(cloud);
            } else {
                if (m.size() == 1)
                    count++;
                else if (m.size() <= 3)
                    count += 2;
                else
                    count += (m.size() / 2) + 1;

                m.clear();
            }
        }

        count += (lastZerosCount / 2);

        return count;
    }

    static int jumpingOnCloudsOptimized(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (i + 2 == c.length || c[i + 2] == 1) {
                jumps++;
                continue;
            }

            i++;
            jumps++;
        }

        return jumps;
    }
}
