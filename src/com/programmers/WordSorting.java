package com.programmers;

import java.util.*;
import java.util.Arrays;

public class WordSorting {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        String[] sortedArr = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            sortedArr[i] = String.valueOf(strings[i].charAt(n));
        }
        Arrays.sort(sortedArr);
        for (int i = 0; i < strings.length; i++) {
            String word = sortedArr[i];
            for (int j = 0; j < strings.length; j++) {
                if (strings[j] != null && strings[j].charAt(n) == word.charAt(0)) {
                    answer[i] = strings[j];
                    strings[j] = null;
                    break;
                }
            }
        }
        return answer;
    }
}
