package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

//
public class Q25305 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] condition = reader.readLine().split(" ");
        String[] scores = reader.readLine().split(" ");
        Integer[] convertScores =  new Integer[scores.length];
        for (int i = 0; i < scores.length; i++) {
            convertScores[i] = Integer.parseInt(scores[i]);
        }
        Arrays.sort(convertScores, Comparator.reverseOrder());
        writer.append(String.valueOf(convertScores[Integer.parseInt(condition[1]) - 1]));
        reader.close();
        writer.flush();
        writer.close();
    }
}
