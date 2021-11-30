package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//한수(등차수열)
public class Q1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(reader.readLine());
        int count  = 0;
        for(int i = 1; i <= number; i++) {
            if(i > 99) {
                String[] targetNum = String.valueOf(i).split("");
                int diff = Integer.parseInt(targetNum[1]) - Integer.parseInt(targetNum[0]);
                boolean flag = false;
                for(int j = 1; j  < targetNum.length; j++) {
                    if(!(Integer.parseInt(targetNum[j - 1]) + diff == Integer.parseInt(targetNum[j]))) {
                        flag = false;
                    } else {
                        flag = true;
                    }
                }
                if(flag) {

                    count++;
                }
            } else {
                count++;
            }
        }

        writer.append(String.valueOf(count));
        writer.flush();
        reader.close();
        writer.close();
    }
}
