package com.leetCode;

// O(n^2)
// best condition : https://leetcode.com/problems/richest-customer-wealth/solutions/961720/java-1-liner-explained/?orderBy=most_votes
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum;
        int big = 0;
        for(int i = 0; i < accounts.length; i++) {
            sum = 0;
            for(int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > big) {
                big = sum;
            }
        }
        return big;
    }
}
