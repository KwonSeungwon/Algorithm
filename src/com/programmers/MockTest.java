package com.programmers;

import java.util.Arrays;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] studentOne = new int[]{1, 2, 3, 4, 5}; // 5
        int[] studentTwo = new int[]{2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] studentThree = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
        int[] answer = new int[]{0, 0, 0};
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        for (int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            if (studentOne[countOne] == ans) {
                answer[0]++;
            }
            if (studentTwo[countTwo] == ans) {
                answer[1]++;
            }
            if (studentThree[countThree] == ans) {
                answer[2]++;
            }
            countOne++;
            countTwo++;
            countThree++;
            if (countOne == 5) {
                countOne = 0;
            }
            if (countTwo == 8) {
                countTwo = 0;
            }
            if (countThree == 10) {
                countThree = 0;
            }
        }
        int max = Arrays.stream(answer).max().getAsInt();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < answer.length; i++) {
            if (answer[i] == max) {
                result.append(i + 1);
            }
        }
        String[] results = result.toString().split("");

        return Arrays.stream(results).mapToInt(Integer::parseInt).toArray();
    }
}
