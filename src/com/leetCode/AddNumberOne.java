package com.leetCode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AddNumberOne {
    public int[] plusOne(int[] digits) {

        StringBuilder sb = new StringBuilder();

        for (int num : digits) {
            sb.append(num);
        }
        String sum  = String.valueOf(new BigInteger(sb.toString()).add(BigInteger.valueOf(1)));
        int[] result = new int[sum.length()];
        int cnt = 0;
        for (String i : sum.split("")) {
            result[cnt] = Integer.parseInt(i);
            cnt++;
        }
        System.out.println(Arrays.toString(result));

        return result;
    }
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length(), result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }
        System.out.println(result);
        return result;
    }
//    public int romanToInt(String s) {
//        int result = 0;
//        for (CombinationRoman cr : CombinationRoman.values()) {
//            if (s.contains(cr.toString())) {
//                s = s.replace(cr.toString(), "");
//                result += cr.value;
//            }
//        }
//        if (!Objects.equals(s, "")) {
//            for(String item : s.split("")) {
//                result += Roman.valueOf(item).value;
//            }
//        }
//        return result;
//    }


    public static enum Roman {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);
        private Integer value;

        Roman(Integer value) {
            this.value = value;
        }
    }
    public static enum CombinationRoman {
        IV(4),
        IX(9),
        XL(40),
        XC(90),
        CD(400),
        CM(900);
        private Integer value;

        CombinationRoman(Integer value) {
            this.value = value;
        }
    }

}
