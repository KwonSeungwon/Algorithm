package com.baekjoon;

public class FoodFighter {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i != food.length; i++) {
            answer.append(addNumbers((food[i] / 2), i));
        }
        StringBuilder origin = new StringBuilder(answer);
        origin.append(0).append(answer.reverse());
        return origin.toString();
    }

    public String addNumbers(int num, int idx) {
        StringBuilder returnValue = new StringBuilder();
        for (int i = 0; i < num; i++) {
            returnValue.append(idx);
        }

        return returnValue.toString();
    }
}