package com.programmers;

import java.util.*;

//숫자 문자열과 영단어
public class ConverStringToNumber {

    public int solution(String s) {
        Map<String, String> numbers = setData();
        for (String key : numbers.keySet()) {
            if (s.contains(key)) {
                s = s.replace(key, numbers.get(key));
            }
        }
        return Integer.parseInt(s);
    }

    public Map<String, String> setData() {

        Map<String, String> numbers = new HashMap<>();
        numbers.put("zero", "0");
        numbers.put("one", "1");
        numbers.put("two", "2");
        numbers.put("three", "3");
        numbers.put("four", "4");
        numbers.put("five", "5");
        numbers.put("six", "6");
        numbers.put("seven", "7");
        numbers.put("eight", "8");
        numbers.put("nine", "9");

        return numbers;
    }
}
