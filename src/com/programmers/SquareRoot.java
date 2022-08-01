package com.programmers;

public class SquareRoot {
    public long solution(long n) {
        long answer = -1;
        for (int i = 1; i < n; i++) {
            if ((long) i * i == n) {
                answer = ((long) (i + 1) * (i + 1));
                break;
            }
        }
        /**
         * Math함수 사용..
         *  if (Math.pow((int)Math.sqrt(n), 2) == n) {
         *             return (long) Math.pow(Math.sqrt(n) + 1, 2);
         *         }
         */
        return answer;
    }
}
