package com.programmers;

//x만큼 간격이 있는 n개의 숫자
public class XbetweenN {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long ago = 0;
        for(int i = 0; i < n; i++) {
            answer[i] += ago + x;
            ago = answer[i];
        }
        return answer;
    }
}
