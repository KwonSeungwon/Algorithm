package com.programmers;

public class StrangeWord {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        String[] word = s.split("");
        for (String value : word) {
            if (value.equals(" ")) {
                cnt = 0;
                answer.append(" ");
            } else {
                if (cnt % 2 != 0) {
                    answer.append(value.toLowerCase());
                } else {
                    answer.append(value.toUpperCase());
                }
                cnt++;
            }
        }
        return answer.toString();
    }
}
