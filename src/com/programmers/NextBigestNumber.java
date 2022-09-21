package com.programmers;

public class NextBigestNumber {
    public int solution(int n) {
        int oneCount = Integer.toBinaryString(n).replace("0", "").length();
        n++;
        while(true) {
            int answerNumber = Integer.toBinaryString(n).replace("0", "").length();
            if (oneCount == answerNumber) {
                break;
            }
            n++;
        }
        return n;
    }
}
