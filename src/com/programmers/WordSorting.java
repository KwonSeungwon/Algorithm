package com.programmers;

import java.util.ArrayList;
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
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            String word = sortedArr[i];
            for (int j = count; j < strings.length; j++) {
                if (strings[j].charAt(n) == word.charAt(0)) {
                    answer[i] = strings[j];
                    count++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
