package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//설탕배달
public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int value = Integer.parseInt(reader.readLine());
        System.out.println(value / 5);
        System.out.println(value / 3);
        if(value % 5 < 0 || value % 3 < 0) {
            writer.append("-1");
        }



        writer.flush();
        writer.close();
        reader.close();
    }
}
