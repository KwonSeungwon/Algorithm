package com.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2480 {


    public static void conditionSolution() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] dice = reader.readLine().split(" ");
        int diceOne = Integer.parseInt(dice[0]);
        int diceTwo = Integer.parseInt(dice[1]);
        int diceThree = Integer.parseInt(dice[2]);
        Arrays.sort(dice);
        if (diceOne == diceTwo && diceTwo == diceThree) { // A와 B가 같고 B와 C가 같으면 A와 C는 같다
            System.out.println(10000 + diceOne * 1000);
        } else if (diceOne == diceTwo) { // A와 B
            System.out.println(1000 + diceOne * 100);
        } else if (diceTwo == diceThree) { // B와 C
            System.out.println(1000 + diceTwo * 100);
        } else if (diceOne == diceThree) { // A와 C
            System.out.println(1000 + diceOne * 100);
        } else {
            System.out.println(Integer.parseInt(dice[2]) * 100);
        }
    }

    public static void main(String[] args) throws Exception {
        conditionSolution();
    }
}
