package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//그룹단어체커1
public class Q1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(reader.readLine());
        int result = 0;
        for (int i = 0; i < count; i++) {
            String S = reader.readLine();
            boolean[] check = new boolean[26];
            boolean tmp = true;

            for (int j = 0; j < S.length(); j++) {
                int index = S.charAt(j) - 'a';
                if (check[index]) {
                    if (S.charAt(j) != S.charAt(j - 1)) {
                        tmp = false;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }
            if (tmp) result++;
        }
        writer.append(String.valueOf(result));
        writer.flush();
        reader.close();
        writer.close();
    }
}
