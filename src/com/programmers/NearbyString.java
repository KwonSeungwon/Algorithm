package com.programmers;

import java.util.Arrays;

public class NearbyString {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] socket = new int[130];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (socket[ch] == 0) {
                socket[ch] = i;
                answer[i] = -1;
            } else {
                answer[i] = i - socket[ch];
                socket[ch] = i;
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
