package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//소수
public class Q2518 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int start = Integer.parseInt(reader.readLine());
        int end  = Integer.parseInt(reader.readLine());
        int min = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if(i == 2) {
                sum += 2;
                min = 2;
                continue;
            }
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if(j + 1 == i) {
                    if (sum == 0) {
                        min = j + 1;
                    }
                    sum += j + 1;
                }
            }
        }
        if (sum == 0) {
            writer.append("-1");
        } else {
            writer.append(String.valueOf(sum)).append("\n");
            writer.append(String.valueOf(min));
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
