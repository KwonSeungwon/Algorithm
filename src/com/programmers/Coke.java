package com.programmers;

//콜라문제
public class Coke {
    public int solution(int a, int b, int n) {
        int totalGetCola = 0;
        int nowGetCola = 0;
        while(n >= a) {
            nowGetCola = n / a * b;
            totalGetCola += nowGetCola;
            n = nowGetCola + n % a;
        }
        return totalGetCola;
    }
}
