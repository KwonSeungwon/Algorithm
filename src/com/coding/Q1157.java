package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String originWord = bufferedReader.readLine().toUpperCase();
        int max = 0;
        String result = "";
        Set<String> overlapWord = new HashSet<>(Arrays.asList(originWord.split("")));
        for(String word : overlapWord) {
            int count = originWord.length() - originWord.replace(word, "").length();
            if(count > max) {
                result = word;
                max = count;
            } else if(count == max) {
                result = "?";
            }
        }
        System.out.println(result);
        bufferedReader.close();
    }

    /* 정답코드
    int[] arr = new int[26];
    int c = System.in.read();
        while (c > 64) {
        if (c < 91) {
            arr[c - 65]++;
        } else {
            arr[c - 97]++;
        }
        c = System.in.read();
    }
    int max = -1;
    int ch = -2;
        for (int i = 0; i < 26; i++) {

        if (arr[i] > max) {
            max = arr[i];
            ch = i;
        } else if (arr[i] == max) {
            ch = -2;
        }
    }
        System.out.print((char) (ch+65));
        
     */
}
