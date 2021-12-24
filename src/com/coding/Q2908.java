package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//상수
public class Q2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] numbers = reader.readLine().split(" ");
        int numberOne = Integer.parseInt(new StringBuilder(numbers[0]).reverse().toString());
        int numberTwo = Integer.parseInt(new StringBuilder(numbers[1]).reverse().toString());

        writer.append(numberOne > numberTwo ? String.valueOf(numberOne) : String.valueOf(numberTwo));
        reader.close();
        writer.close();

    }
}
