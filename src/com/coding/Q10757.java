package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

// 큰수 A+B
public class Q10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] values = reader.readLine().split(" ");
        BigInteger a = new BigDecimal(values[0]).toBigInteger();
        BigInteger b = new BigDecimal(values[1]).toBigInteger();
        System.out.println(a.add(b));
    }
}
