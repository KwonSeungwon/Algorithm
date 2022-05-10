package com.programmers;

import java.util.Arrays;

//K넘버
// copyofRange함수를 사용해볼 것.
public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int k = commands[i][2] - 1;
//            StringBuilder data = new StringBuilder();
            int[] newArr = new int[end - start + 1];
            int count = 0;
            for(int j = start; j <= end; j++) {
                newArr[count++] = array[j];
            }
//            String[] splitData = data.toString().split("");
            Arrays.sort(newArr);
            answer[i] = newArr[k];
        }
        return answer;
    }
}
