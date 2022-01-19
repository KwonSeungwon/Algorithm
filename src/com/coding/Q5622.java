package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//다이얼
public class Q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] values = reader.readLine().toCharArray();
        /**
         * a ~ c 65 ~ 67
         * d ~ f 68 ~ 70
         * g ~ I 71 ~ 73
         * j ~ l 74 ~ 76
         * m ~ o 77 ~ 79
         * p ~ s 80 ~ 83
         * t ~ v 84 ~ 86
         * w ~ z 87 ~ 90
         */
        int result = 0;
        //char 타입이용
        for(char data : values) {
            if (data >= 65 && data <= 67) {
                result += 3;
            } else if (data >= 68 && data <= 70) {
                result += 4;
            } else if (data >= 71 && data <= 73) {
                result += 5;
            } else if (data >= 74 && data <= 76) {
                result += 6;
            } else if (data >= 77 && data <= 79) {
                result += 7;
            } else if (data >= 80 && data <= 83) {
                result += 8;
            } else if (data >= 84 && data <= 86) {
                result += 9;
            } else {
                result += 10;
            }
        }
//string이용
//        for(int i = 0; i < values.length(); i++) {
//            int charNumber = values.charAt(i);
//            if (charNumber >= 65 && charNumber <= 67) {
//                result += 3;
//            } else if (charNumber >= 68 && charNumber <= 70) {
//                result += 4;
//            } else if (charNumber >= 71 && charNumber <= 73) {
//                result += 5;
//            } else if (charNumber >= 74 && charNumber <= 76) {
//                result += 6;
//            } else if (charNumber >= 77 && charNumber <= 79) {
//                result += 7;
//            } else if (charNumber >= 80 && charNumber <= 83) {
//                result += 8;
//            } else if (charNumber >= 84 && charNumber <= 86) {
//                result += 9;
//            } else {
//                result += 10;
//            }
//        }
        System.out.println(result);
        reader.close();
    }
}
