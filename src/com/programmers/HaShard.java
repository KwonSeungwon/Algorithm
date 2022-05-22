package com.programmers;


public class HaShard {
    public boolean solution(int x) {
        String[] cutValues = String.valueOf(x).split("");
        int sum = 0;
        for(String word : cutValues) {
            sum += Integer.parseInt(word);
        }

        return x % sum == 0;
    }
}
