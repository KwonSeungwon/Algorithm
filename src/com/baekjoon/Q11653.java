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

        int target = Integer.parseInt(reader.readLine());
        int i = 2;
        while(true) {
            if(target % i == 0) {
                writer.append(String.valueOf(i));
                continue;
            } e
            i++;
        }
    }
}
