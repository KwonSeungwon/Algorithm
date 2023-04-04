package com.leetCode;

import java.util.Arrays;

public class AddNumberOne {
    public int[] plusOne(int[] digits) {

        StringBuilder sb = new StringBuilder();

        for (int num : digits) {
            sb.append(num);
        }
        String sum  = String.valueOf(Integer.parseInt(sb.toString()) + 1);
        int[] result = new int[sum.length()];
        int cnt = 0;
        for (String i : sum.split("")) {
            result[cnt] = Integer.parseInt(i);
            cnt++;
        }

        return result;
    }

}
