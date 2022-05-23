package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//크로아티아 알파벳
public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] croatiaWord = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = reader.readLine();
//        int count = 0;
        for(int i = 0; i < croatiaWord.length; i++) {
            word = word.replace(croatiaWord[i], "0");
//            String agoWord = word;
//            word = word.replaceFirst(croatiaWord[i], " ");
//            if (agoWord.length() != word.length()) {
//                i--;
//                count++;
//            }
        }

        writer.append(String.valueOf(word.length()));
        writer.flush();
        reader.close();
        writer.close();
    }
}
