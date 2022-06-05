package com.programmers;

public class CommonMutipleAndDivisor {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int commonMutilpe = m;
        int commonDivisor = n;
        while(true) {
            if (commonMutilpe % n == 0) {
                answer[1] = commonMutilpe;
                break;
            } else {
                commonMutilpe += m;
            }
        }
        for(int i = 1; i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                commonDivisor = i;
                answer[0] = commonDivisor;
            }
        }
        return answer;
    }
}
