package com.programmers;

//음양 더하기
public class PlusAndMinus {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] *= - 1;
            }
            answer += absolutes[i];
        }
        return answer;
    }
}
