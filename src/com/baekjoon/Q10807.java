package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//개수세기
public class Q10807 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        String[] numbers = reader.readLine().split(" ");
        String target = reader.readLine();
        int result = 0;
        for(String number : numbers) {
            if (number.equals(target)) {
                result++;
            }
        }
        writer.append(String.valueOf(result));
        writer.flush();
        writer.close();
        reader.close();
    }
}
