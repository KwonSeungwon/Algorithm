package com.programmers;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            if (budget - d[i] >= 0) {
                budget -= d[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
