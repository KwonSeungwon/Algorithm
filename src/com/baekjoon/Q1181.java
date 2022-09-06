package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//단어정렬
public class Q1181 {
    public static void main(String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(reader.readLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            words.add(reader.readLine());
        }
        Collections.sort(words);
        words.sort((o1, o2) -> o1.length() - o2.length());
        words.stream().distinct().collect(Collectors.toList()).forEach(wd -> {
            try {
                writer.append(wd).append("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        reader.close();
        writer.flush();
        writer.close();
    }
}
