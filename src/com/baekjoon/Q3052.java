package com.baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int value = Integer.parseInt(bufferedReader.readLine()) % 42;
            result.add(value);
        }
        System.out.println(result.size());
    }
}
