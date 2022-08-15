package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//체스
public class Q3003 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] chess = reader.readLine().split(" ");
        writer.append(String.valueOf(1 - Integer.parseInt(chess[0]))).append(" ")
                .append(String.valueOf(1 - Integer.parseInt(chess[1]))).append(" ")
                .append(String.valueOf(2 - Integer.parseInt(chess[2]))).append(" ")
                .append(String.valueOf(2 - Integer.parseInt(chess[3]))).append(" ")
                .append(String.valueOf(2 - Integer.parseInt(chess[4]))).append(" ")
                .append(String.valueOf(8 - Integer.parseInt(chess[5])));

        writer.flush();
        reader.close();
    }
}
