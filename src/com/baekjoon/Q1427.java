package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//소트인사이드
public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] numbers = reader.readLine().split("");
        Arrays.sort(numbers);
//        Arrays.sort(numbers, Collections.reverseOrder()); // 내림차순정렬
//        Arrays.stream(numbers).forEach(a -> {
//            try {
//                writer.append(a);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
        for(int i = numbers.length - 1; i >= 0; i--) {
            writer.append(numbers[i]);
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
