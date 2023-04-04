package com.leetCode;

import java.util.Stack;

public class Brackets {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(') {
                stack.push(')');
            } else if (bracket == '[') {
                stack.push(']');
            } else if (bracket == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != bracket) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
