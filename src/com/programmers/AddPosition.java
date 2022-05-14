package com.programmers;

import java.util.Arrays;

//자릿수 더하기
public class AddPosition {
    public int solution(int n) {

        return Integer.parseInt(Arrays.stream(String.valueOf(n).split("")).reduce((a, b) -> String.valueOf(Integer.parseInt(a) + Integer.parseInt(b))).get());
    }
}
