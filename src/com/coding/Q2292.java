package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//벌집
public class Q2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(reader.readLine());
        int seq = 1;
        int count = 0;

        while(true){
            seq += 6 * count;
            count++;
            if(seq >= target) {
                writer.append(String.valueOf(count));
                break;
            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
