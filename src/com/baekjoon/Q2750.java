package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

//정렬
public class Q2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int loopCount = Integer.parseInt(reader.readLine());
        List<Integer> data = new ArrayList<>();
//        int[] sortData = new int[loopCount];
        for(int i = 0; i < loopCount; i++) {
            data.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(data);

        for(int i = 0; i < data.size(); i++) {
            writer.append(data.get(i).toString()).append("\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
