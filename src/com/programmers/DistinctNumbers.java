package com.programmers;

import java.util.Arrays;

public class DistinctNumbers {
    public int[] solution(int []arr) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    answer.append(arr[i]).append(" ");
                    i = j;
                    break;
                }
            }
        }
        System.out.println(answer);
        return null;
    }
}
