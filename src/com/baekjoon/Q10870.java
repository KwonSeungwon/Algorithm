package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치
public class Q10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        condition(Integer.parseInt(reader.readLine())); // 스위치문 버전
        System.out.printf("%d", recursion(Integer.parseInt(reader.readLine()))); // 재귀
        reader.close();
    }
    public static int recursion(int value) {
        if (value == 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        }
        return recursion(value - 1) + recursion(value - 2);
    }

    public static void condition(int value) {
        switch (value) {
            case 1 :
                System.out.printf("%d", 1);
                break;
            case 2 :
                System.out.printf("%d", 1);
                break;
            case 3 :
                System.out.printf("%d", 2);
                break;
            case 4 :
                System.out.printf("%d", 3);
                break;
            case 5 :
                System.out.printf("%d", 5);
                break;
            case 6 :
                System.out.printf("%d", 8);
                break;
            case 7 :
                System.out.printf("%d", 13);
                break;
            case 8 :
                System.out.printf("%d", 21);
                break;
            case 9 :
                System.out.printf("%d", 34);
                break;
            case 10 :
                System.out.printf("%d", 55);
                break;
            case 11 :
                System.out.printf("%d", 89);
                break;
            case 12 :
                System.out.printf("%d", 144);
                break;
            case 13 :
                System.out.printf("%d", 233);
                break;
            case 14 :
                System.out.printf("%d", 377);
                break;
            case 15 :
                System.out.printf("%d", 610);
                break;
            case 16 :
                System.out.printf("%d", 987);
                break;
            case 17 :
                System.out.printf("%d", 1597);
                break;
            case 18 :
                System.out.printf("%d", 2584);
                break;
            case 19 :
                System.out.printf("%d", 4181);
                break;
            case 20 :
                System.out.printf("%d", 6765);
                break;
            default:
                System.out.printf("%d", 0);
                break;
        }
    }
}
