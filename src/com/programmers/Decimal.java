package com.programmers;

public class Decimal {
    public int solution(int n) {
        int answer = n;
        for(int i = 2; i <= n; i++) {
            for(int j = i; j > 4; j--) {
                if(i % j == 0 && i != j) {
                    answer--;
                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
