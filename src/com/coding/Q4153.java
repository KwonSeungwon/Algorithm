package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//직각삼각형
public class Q4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String[] target = reader.readLine().split(" ");
            int a = Integer.parseInt(target[0]);
            int b = Integer.parseInt(target[1]);
            int c = Integer.parseInt(target[2]);
            if(a == 0) {
                break;
            } else if ((a * a) + (b * b) == (c * c)) {
                writer.append("right").append("\n");
            } else if ((b * b) + (c * c) == (a * a)) {
                writer.append("right").append("\n");
            } else if ((c * c) + (a * a) == (b * b)) {
                writer.append("right").append("\n");
            } else {
                writer.append("wrong").append("\n");
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}

