package com.programmers;

public class CommonMultiple {
    public int solution(int[] arr) {
        int number = arr[arr.length - 1];
        boolean isCommon = false;
        while(true) {
            for (int i = 0; i != arr.length; i++) {
                if (number % arr[i] != 0) {
                    break;
                }
            }
            if (isCommon) {
                break;
            }
            number++;
        }
        System.out.println(number);

        return number;
    }
}
