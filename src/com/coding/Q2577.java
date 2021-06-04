package com.coding;

import java.io.*;

public class Q2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int multiplication = 1;
        for(int i = 0; i < 3; i++) {
            multiplication *= Integer.parseInt(bufferedReader.readLine());
        }
        String[] spliceValue = String.valueOf(multiplication).split("");
        int count = 0;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < spliceValue.length; j++) {
                if(Integer.parseInt(spliceValue[j]) == i) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
