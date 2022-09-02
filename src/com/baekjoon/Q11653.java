package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//소인수분해
public class Q11653 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int targetNumber = Integer.parseInt(reader.readLine().split(" ")[0]);
        int count = 2;
        while(true) {
            if (targetNumber % count == 0) {
                writer.append(String.valueOf(count)).append("\n");
                targetNumber = targetNumber / count;
            } else {
                count++;
            }
            if (targetNumber == 1) break;
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
