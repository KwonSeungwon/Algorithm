package com.programmers;

//문자열 나누기
public class DivideWord {
    public int solution(String s) {
        int answer = 0;
        int x = 1;
        int x2 = 0;
        char targetWord = s.charAt(0);

        for(int i = 1; i != s.length(); i++) {
            if (x == x2) { //x와 x2가 같아지는 순간
                targetWord = s.charAt(i);
                x = 0;
                x2 = 0;
                answer++;
            }
            if (targetWord == s.charAt(i)) {
                x++;
            } else {
                x2++;
            }
        }
        return answer + 1;
    }
}
