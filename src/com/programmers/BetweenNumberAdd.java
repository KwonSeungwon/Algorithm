package com.programmers;

public class BetweenNumberAdd {
    public long solution(int a, int b) {
        long answer = 0;
        int big; int small;
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }
        for(int i = small; i <= big; i++) {
            answer += i;
        }
        return answer;
    }

    //등차수열 풀이
    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
