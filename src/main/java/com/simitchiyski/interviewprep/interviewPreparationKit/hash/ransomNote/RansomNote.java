package com.simitchiyski.interviewprep.interviewPreparationKit.hash.ransomNote;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static boolean checkMagazine(String[] magazine, String[] note) {
        if (note.length > magazine.length) {
            return false;
        }

        Map<String, Integer> hs = new HashMap<>(magazine.length);
        for (String str : magazine) {
            hs.merge(str, 1, Integer::sum);
        }

        for (String str : note) {
            if (!hs.containsKey(str) || hs.get(str) == 0)
                return false;
            else {
//                hs.replace(str, hs.get(str), hs.get(str) - 1);
                hs.merge(str, -1, Integer::sum);
            }
        }

        return true;
    }
}
