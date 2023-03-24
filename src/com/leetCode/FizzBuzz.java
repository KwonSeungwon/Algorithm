package com.leetCode;

import java.util.*;
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            // 연산을 다음과 같이 변수에 할당하여 사용하는방법
            // boolean div3 = i % 3 == 0;
            // boolean div5 = i % 5 == 0;

            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
