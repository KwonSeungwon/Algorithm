package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//설탕배달
public class Q2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int value = Integer.parseInt(reader.readLine());
        int quoFive = value / 5;
        int reFive = value % 5;
        int quoThree = value / 3;
        int divThree = value % 3;
        if (quoFive > 0 && reFive == 0) { //5로 나눠떨어질 때
            writer.append(String.valueOf(quoFive));
        } else if(quoFive > 0 && reFive % 3 == 0) { // 5로 나눈 나머지가 3으로 나눠떨어질 때
            writer.append(String.valueOf(quoFive + (reFive / 3)));
        } else if(quoThree > 0 && divThree == 0) { // 3으로 나눠떨어질 때
            writer.append(String.valueOf(quoThree));
        } else { // 외의 상황
            int count = 0;
            while(true) {
                count++;
                value -= 5;
                if(value < 3) {
                    writer.append("-1");
                    break;
                } else if (value % 3 == 0) {
                    writer.append(String.valueOf(count + (value / 3)));
                    break;
                }
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
