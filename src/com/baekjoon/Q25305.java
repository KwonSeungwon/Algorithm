package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q25305 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] condition = reader.readLine().split(" ");
        String[] scores = reader.readLine().split(" ");
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        writer.append(scores[Integer.parseInt(condition[1])]);


        reader.close();
        writer.flush();
        writer.close();
    }
}
