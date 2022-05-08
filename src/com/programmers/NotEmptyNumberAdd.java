package com.programmers;

//없는 수자 더하기
public class NotEmptyNumberAdd {
    public int solution(int[] numbers) {
        int[] setNumbers = new int[10];
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            setNumbers[numbers[i]] = numbers[i];
        }
        for (int i = 0; i < setNumbers.length; i++) {
            if (setNumbers[i] == 0) {
                answer += i;
            }
        }
        return answer;
        // 다더해놓고 빼기
//        int sum = 45;
//        for (int i : numbers) {
//            sum -= i;
//        }
//        return sum;
    }
}
