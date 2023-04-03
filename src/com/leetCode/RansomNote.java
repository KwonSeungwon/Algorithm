package com.leetCode;


public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuffer sb = new StringBuffer(ransomNote);
        for (int i = 0; i != magazine.length(); i++) {
            if (sb.indexOf(String.valueOf(magazine.charAt(i))) > -1) {
                sb.deleteCharAt(sb.indexOf(String.valueOf(magazine.charAt(i))));
            }
        }

        return sb.length() == 0;
    }
}
