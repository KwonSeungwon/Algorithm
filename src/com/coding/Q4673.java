package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//셀프넘버
public class Q4673 {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = {};
        for(int i = 1; i <= 1000; i++) {
            numbers[i] = i;
        }
        for(int i = 1; i <= 1000; i++) {
            String[] splitNumber = String.valueOf(i).split("");
            int sum = 0;
            for(int j = 0 ; j < splitNumber.length; j++) {
                sum += i + Integer.parseInt(splitNumber[j]);
            }
            numbers[sum] = Integer.parseInt(null);
        }
        for(int i = 0; i < )
        writer.flush();
        writer.close();
    }
}
