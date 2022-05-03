package com.programmers;

import java.util.Arrays;

public class ReverseNumber {
    public int[] solution(long n) {

        return Arrays.stream(new StringBuffer(String.valueOf(n)).reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();

    }
}
