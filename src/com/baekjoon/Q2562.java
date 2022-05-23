package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = new String[9];
        for(int i = 0; i < 9; i++) {
            arr[i] = bufferedReader.readLine();
        }
        int max = Integer.parseInt(arr[0]);
        int location = 0;
        for(int i = 0; i < arr.length; i++) {
            int val = Integer.parseInt(arr[i]);
            if(val > max) {
                max = val;
                location = i;
            }
        }
        System.out.println(max);
        System.out.println(location + 1);
        bufferedReader.close();
    }
}
