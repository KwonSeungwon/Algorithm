package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//수 정렬하기3
public class Q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(reader.readLine());
        int[] items = new int[range];
        for(int i = 0 ; i < range; i++) {
            items[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(items);
        for(Integer a : items) {
            writer.append(a.toString()).append("\n");
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
