package com.programmers;

/**
 * @see {@link https://ju-nam2.tistory.com/19}
 */
public class Decimal {
    public int solution(int n) {
        int answer = 0;
        int[] number = new int[n+1];
        //2부터 n까지의 수를 배열에 삽입
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }
        //2부터 시작해서 그의 배수들을 0으로 만든다, 이후후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for(int i=2; i<=n; i++) {
            if(number[i]==0) {
                continue;
            }
            for(int j= 2*i; j<=n; j += i) {
                number[j] = 0;
            }
        }
        for(int i=0; i<number.length; i++) {
            if(number[i]!=0) {
                answer++;
            }
        }
        return answer;
    }
}
