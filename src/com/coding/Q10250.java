package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//ACM호텔
public class Q10250 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(reader.readLine());
        for(int i = 0; i < range; i++) {
            String[] data = reader.readLine().split(" ");
            int h = Integer.parseInt(data[0]);
            int p = Integer.parseInt(data[2]);
            int remain = p % h;
            int quotient = (p / h) + 1;
            if(remain == 0) {
                quotient = (p / h);
                writer.append(String.valueOf(h * 100 + quotient)).append("\n");
            } else {
                writer.append(String.valueOf(remain * 100 + quotient)).append("\n");
            }
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
