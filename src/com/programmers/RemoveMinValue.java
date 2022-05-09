package com.programmers;

import java.util.*;

public class RemoveMinValue {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        } else {
            List<Integer> answerL = new ArrayList<>();
            int min = Arrays.stream(arr).min().getAsInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answerL.add(arr[i]);
                }
            }
            int[] answer = new int[answerL.size()];
            for(int a = 0; a < answerL.size(); a++) {
                answer[a] = answerL.get(a);
            }
            return answer;
        }
        // 스트림 이용
//        if (arr.length <= 1) return new int[]{ -1 };
//        int min = Arrays.stream(arr).min().getAsInt();
//        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
