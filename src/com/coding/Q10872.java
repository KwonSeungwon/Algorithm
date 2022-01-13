package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//팩토리얼(재귀)
public class Q10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(reader.readLine());
        System.out.println(factorial(value));

        reader.close();
    }

    public static int factorial(int value) {
        if(value == 0) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
}
