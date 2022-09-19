package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1436 {
    public static void main(String[] args) throws Exception {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int result = 0;
        for (int i = 10; i != number; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(String.valueOf(i));


        }
        writer.append(String.valueOf(result));

        reader.close();
        writer.flush();
        writer.close();
    }
}
