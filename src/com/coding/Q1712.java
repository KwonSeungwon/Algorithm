package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//손익분기점
public class Q1712 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] data = reader.readLine().split(" ");
        int fixedCost = Integer.parseInt(data[0]);
        int waveCost = Integer.parseInt(data[1]);
        int sales = Integer.parseInt(data[2]);
        int value = sales - waveCost;
        //고정비 / (판매가 - 변동비) + 1
        //회계학에서는 고정비 / 1 - (변동비 / 판매가)를 구하면 손익분기점금액이 나옴
        if(waveCost > sales || value == 0) {
            System.out.println("-1");
        } else {
            System.out.println(fixedCost / value + 1);
        }
        reader.close();
    }
}
