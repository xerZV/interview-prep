package com.simitchiyski.interviewprep.interviewPreparationKit.hash.ransomNote;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static boolean checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> hs = new HashMap<>(magazine.length);
        for (String str : magazine) {
            if (!hs.containsKey(str)) {
                hs.put(str, 1);
            } else {
                hs.replace(str, hs.get(str), hs.get(str) + 1);
            }
        }

        for (String str : note) {
            if (!hs.containsKey(str) || hs.get(str) == 0)
                return false;
            else {
                hs.replace(str, hs.get(str), hs.get(str) - 1);
            }
        }

        return true;
    }
}
