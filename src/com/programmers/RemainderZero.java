package com.programmers;

public class RemainderZero {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i >= 2; i--) {
            if (n % i == 1) {
                answer = i;
            }
        }
        return answer;
    }
}
