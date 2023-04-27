package com.leetCode;

public class Climbing {
    public int climbStairs(int n) {

        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        }
        int result = 0;
        while(true) {
            int remain = n % 2;
            if (remain == 0) {
              result++;
              break;
            } else if (remain == 1) {
                result++;
                break;
            } else {
                n = remain;
                result++;
            }
        }
        System.out.println(result);

        return result * 2 + 1;
    }
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) {
            return t.charAt(0);
        }
        StringBuilder stb = new StringBuilder(t);
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int tPosition = stb.indexOf(String.valueOf(a));
            if (tPosition > -1) {
                stb.deleteCharAt(stb.indexOf(String.valueOf(a)));
            }
        }
        System.out.println(stb.toString());

        return stb.charAt(0);
    }
}
