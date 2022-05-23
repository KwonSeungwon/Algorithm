package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; i++) {
            String[] answer = bufferedReader.readLine().split("");
            int score = 0;
            int totalScore = 0;
            for(int j = 0; j < answer.length; j++) {
                if(answer[j].equals("O")) {
                    score++;
                    totalScore += score;
                } else {
                    score = 0;
                }
            }
            result.append(totalScore).append("\n");
            score = 0;
        }
        System.out.println(result);
        bufferedReader.close();
    }
}
