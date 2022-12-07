package com.programmers;

import java.util.Arrays;

public class SelectTangerine {;
    public int solution(int k, int[] tangerine) {
        int[] arr = new int[100001];
        int num = 0;
        for(int item : tangerine) {
            arr[item]++;
        }
        for(int item : tangerine) {
            if (arr[item] == 1) {
                num++;
            }
        }
        System.out.println(k - num);
        return k;
    }
}
