package com.programmers;

public class MatchRemove {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount = s.length();
        while (true) {
            s = s.replace("0", "");
            zeroCount = zeroCount - s.length();
            s = Integer.toBinaryString(s.length());
            answer[0]++;
            answer[1] += zeroCount;
            zeroCount = s.length();
            if (s.equals("1")) {
                break;
            }
        }
        return answer;
    }
}
