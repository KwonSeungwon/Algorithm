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
        String originWord = bufferedReader.readLine();
        String[] splitWord = originWord.split("");
        Set<String> set = new HashSet<>(Arrays.asList(splitWord));
        int result = 0;
        String same = "";
        for(String a : set) {
            int count = originWord.length() - originWord.replace(a, "").length();
            if(count > result) {
                result = count;
            } else if(count == result) {
                same = "?";
            }
        }
        if(same.length() > 0) {
            System.out.println(result);
        } else {
            System.out.println(same);
        }
        bufferedReader.close();
    }
}
