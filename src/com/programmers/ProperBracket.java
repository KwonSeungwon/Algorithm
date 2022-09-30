package com.programmers;

public class ProperBracket {
    boolean solution(String s) {
        boolean answer = true;
        boolean isClosed = false;
        int left = 0;
        int rignt = 0;
        String[] brackets = s.split("");
        for (String bracket : brackets) {
            if (bracket.equals("(")) {
                isClosed = false;
                left++;
            } else {
                isClosed = true;
                rignt++;
            }
            if (!isClosed && rignt > 0) {
                left = 0;
                rignt = 0;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
