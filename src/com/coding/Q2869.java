package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 달팽이는 올라가고 싶다
public class Q2869 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = reader.readLine().split(" ");
        int up = Integer.parseInt(data[0]) - Integer.parseInt(data[1]);
        int down = Integer.parseInt(data[1]);
        int height = Integer.parseInt(data[2]);

        int result = (height - down) / up;
        if ((height - down) % up != 0) {
            writer.append(String.valueOf(++result));
        } else {
            writer.append(String.valueOf(result));
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
