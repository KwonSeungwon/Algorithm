package com.programmers;

public class PandY {
    public boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        if (s.replaceAll("[^pPyY]", "").length() > 0) {
            pCount = s.replaceAll("[^pP]", "").length();
            yCount = s.replaceAll("[^yY]", "").length();
        }
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count(); //람다식

        return pCount == yCount;
    }
}
