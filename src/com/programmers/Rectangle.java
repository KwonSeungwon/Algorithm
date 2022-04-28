package com.programmers;

import java.util.Scanner;

public class Rectangle {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //가로
        int m = sc.nextInt(); //세로
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
