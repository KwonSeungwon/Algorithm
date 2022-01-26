package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Q2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(reader.readLine());
        int[] items = new int[count];
        int sum = 0;
        for(int i = 0; i < count; i++) {
            items[i] = Integer.parseInt(reader.readLine());
            sum += i;
        }
        Arrays.sort(items);
        writer.append(String.valueOf(sum / count)).append("\n"); // 평균
        writer.append(String.valueOf(items[((items.length + 1) / 2) - 1])).append("\n"); // 중위수
//        writer.append(String.valueOf(items[items.length - 1] - items[0])).append("\n"); //최빈값
        writer.append(String.valueOf(items[items.length - 1] - items[0])).append("\n"); //범위

        writer.flush();
        reader.close();
        writer.close();
    }
}
