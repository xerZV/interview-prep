package com.simitchiyski.interviewprep.interviewPreparationKit.warmUp.sockMerchant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SockMerchant {
    public static int sockMerchantWithMap(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>(n);
        for (Integer sockColor : ar) {
            if (map.containsKey(sockColor)) {
                map.replace(sockColor, map.get(sockColor) + 1);
            } else {
                map.put(sockColor, 1);
            }
        }

        map.entrySet().removeIf(e -> e.getValue() < 2);

        return  map.values().stream().mapToInt(v -> v/2).sum();
    }

    public static int sockMerchantWithSet(int n, int[] ar) {
        final Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (Integer i:ar) {
            if (colors.contains(i)) {
                pairs++;
                colors.remove(i);
            } else {
                colors.add(i);
            }
        }

        return  pairs;
    }
}
