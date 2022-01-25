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
        int result = 0;
        if (quoFive > 0 && reFive == 0) { //5로 나눠떨어질 때
            result = quoFive;
            writer.append(String.valueOf(result));
        } else if(reFive % 3 == 0) { //5로 나누고 난 나머지가 3으로 나눠떨어질 때
            result = quoFive + reFive / 3;
            writer.append(String.valueOf(result));
        } else { // 외의 상황
            for(int i = quoFive; i > 0; i--) {
                int data = value - (5 * i);
                if (data % 3 == 0) {
                    result = i + (data / 3);
                    writer.append(String.valueOf(result));
                    break;
                }
            }
        }
        if(result == 0 && quoThree > 0 && divThree == 0) { // 3으로 나눠떨어질 때
            writer.append(String.valueOf(quoThree));
        } else if (result == 0) {
            writer.append("-1");
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
