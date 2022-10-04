package com.programmers;


import java.util.Stack;

public class ProperBracket {
    boolean solution(String s) {
//        int opened = 0;
//        for (int i = 0; i != s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                opened++;
//            } else if (s.charAt(i) == ')') {
//                opened--;
//            }
//            if (opened < 0) {
//                return false;
//            }
//        }
//        return opened == 0;
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        String[] brackets = s.split("");
        if (brackets[0].equals(")")) {
            return false;
        }
        for (String bracket : brackets) {
            if (bracket.equals("(")) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        return answer;
    }
}
