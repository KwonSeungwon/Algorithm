package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//알파벳 찾기
public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String word = reader.readLine();

        for(int i = 0; i < alphabet.length; i++) {
            writer.append(String.valueOf(word.indexOf(alphabet[i]))).append(" ");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
