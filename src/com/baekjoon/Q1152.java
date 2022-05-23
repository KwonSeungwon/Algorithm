package com.baekjoon;

import java.io.*;

public class Q1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String target = reader.readLine().trim();
        String[] item = target.split(" ");
        System.out.println(target.isEmpty() ? 0 : item.length);
        reader.close();
    }
}
