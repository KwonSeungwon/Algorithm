package com.baekjoon;

import java.util.*;

public class BlogWriting {
    public static void main(String[] args) {

//        testCodes.codesOne.add("5"); // UnsupportedOperationException 발생
        testCodes.codesOne.set(3, "5"); // set을 이용하면 수정은 가능하나 확장은 불가능하다.
        testCodes.codesTwo.add("5"); // 정상적으로 삽입됨
    }

    private interface testCodes {
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";

        List<String> codesOne = Arrays.asList(a,b,c,d); // {a,b,c,d} -> [a,b,c,d]가 된 것뿐임
        ArrayList<String> codesTwo = new ArrayList<>(Arrays.asList(a,b,c,d));
        List<String> emptyCodes = new ArrayList<>();
    }
}
