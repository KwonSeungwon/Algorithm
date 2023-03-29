package com.leetCode;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        boolean result = true;
        int i = 0;
        StringBuffer sb = new StringBuffer(ransomNote);
        while (sb.length() != 0) {
            if (sb.indexOf(String.valueOf(magazine.charAt(i))) > -1) {
                sb.deleteCharAt(sb.indexOf(String.valueOf(magazine.charAt(i))));
            }
            if (i == magazine.length()) {
                result = false;
                break;
            } else {
                i++;
            }
        }
        System.out.println(result);

        return result;
    }
}
