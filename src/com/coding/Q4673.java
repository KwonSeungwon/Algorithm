package com.coding;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

//셀프넘버
public class Q4673 {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = new int[10001];
        for(int i = 1; i <= 10000; i++) {
            numbers[i] = i;
        }
        for(int i = 1; i <= 10000; i++) {
            String[] splitNumber = String.valueOf(i).split("");
            int sum = 0;
            for(int j = 0 ; j < splitNumber.length; j++) {
                sum += i + Integer.parseInt(splitNumber[j]);
            }
            if(sum < 10000) {
                numbers[sum] = 0;
            }
        }
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0) {
                writer.append(numbers[i] + "\n");
            }
        }
        writer.flush();
        writer.close();
    }
}
