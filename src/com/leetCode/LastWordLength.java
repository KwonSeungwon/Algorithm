package com.leetCode;

public class LastWordLength {
    public int lengthOfLastWord(String s) {

        s = s.trim();
        int count = 0;
        for(int i = s.length(); i != 0; i--) {
            char target = s.charAt(i - 1);
            if (target == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}
