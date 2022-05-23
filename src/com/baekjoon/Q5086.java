package com.baekjoon;

import java.lang.*;
import java.io.*;

class Q5086 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String[] numbers = reader.readLine().split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            if (a == 0 && b == 0) {
                break;
            } else {
                if (b > a && b % a == 0) { // 약수
                    writer.append("factor").append("\n");
                } else {
                    if (a % b == 0) {
                        writer.append("multiple").append("\n");
                    } else {
                        writer.append("neither").append("\n");
                    }

                }
            }
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}


