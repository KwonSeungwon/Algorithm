package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5597 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[31];
        for (int i = 1; i != 31; i++) {
            arr[Integer.parseInt(reader.readLine())] = 1;
        }
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                writer.append(String.valueOf(i)).append("\n");
            }
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
