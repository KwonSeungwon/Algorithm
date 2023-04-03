package com.leetCode;

import java.util.HashMap;
import java.util.Map;

public class CoomonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i != strs.length; i++) {
            for(int j = 0; j != strs[i].length(); j++) {
                char targetChar = strs[i].charAt(j);
                map.put(targetChar, map.getOrDefault(targetChar, 0) + 1);
                if (map.get(targetChar) == strs.length) {
                    result.append(targetChar);
                }
            }
        }

        return result.toString();
    }
}
