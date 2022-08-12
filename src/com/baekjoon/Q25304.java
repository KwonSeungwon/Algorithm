package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//영수증
public class Q25304 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalAmount = Integer.parseInt(reader.readLine());
        int count = Integer.parseInt(reader.readLine());
        int sum = 0;
        for(int i = 0; i < count; i++) {
            String[] boughtItem = reader.readLine().split(" ");
            sum += Integer.parseInt(boughtItem[0]) * Integer.parseInt(boughtItem[1]);
        }

        writer.append(totalAmount == sum ? "Yes" : "No");
        writer.flush();
        reader.close();
    }
}
