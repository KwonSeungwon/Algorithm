package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11659 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int count = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] results = new int[n + 1];
        for(int i = 1; i <= n; i++) { //합들을 모두 더해놓음
            results[i] = results[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int i = 0; i < count; i++) { // 꺼내서 빼주기만함
            stringTokenizer = new StringTokenizer(reader.readLine(), " ");
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            writer.append(String.valueOf(results[end] - results[start - 1])).append("\n");
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}