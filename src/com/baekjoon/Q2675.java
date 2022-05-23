package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//문자열반복
public class Q2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(reader.readLine());
        for (int i = 0; i < range; i++) {
            String[] data = reader.readLine().split(" ");
            String[] words = data[1].split("");
            StringBuilder builder = new StringBuilder();
            for(int j = 0; j < words.length; j++) {
                for(int k = 0; k < Integer.parseInt(data[0]); k++) {
                    builder.append(words[j]);
                }
            }
            writer.append(builder).append("\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
