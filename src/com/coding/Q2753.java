package com.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//윤년
public class Q2753 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        if((year % 4 == 0) && ((year % 400) == 0 || year % 100 != 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
