package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//1998년생인 내가 태국에서는 2541년생?!
public class Q18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.append(String.valueOf(Integer.parseInt(reader.readLine()) - 543));

        writer.flush();
        reader.close();
    }
}
