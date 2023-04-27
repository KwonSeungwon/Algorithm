package com.leetCode;

import java.util.List;

public class LeetCodeMain {
    public static void main(String[] args) {

//        new SumOfOneArray().runningSum(new int[]{1,2,3,4});
//        new RichestCustomerWealth().maximumWealth(new int[][]{{1,5},{7,3},{3,5}});
//        new FizzBuzz().fizzBuzz(15);
//        new ReduceNumber().numberOfSteps(123);
//        new LinkedList().middleNode(new LinkedList.ListNode());
//        new RansomNote().canConstruct("aab", "baa");
//        new TwoSum().twoSum(new int[]{2,7,11,15}, 9);
//        new CoomonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"});
//        new Brackets().isValid("(]");
//        new LastWordLength().lengthOfLastWord("   fly me   to   the moon  ");
//        new Climbing().climbStairs(3);
//        new Climbing().findTheDifference("abcd", "abcde");
        new LeetCodeMain().guessNumber(5);
    }

    public int guess(int n) {
        int picked = 10;
        if (picked > n) {
            return -1;
        } else if (picked < n) {
            return 1;
        }
        return 0 ;
    }


    public int guessNumber(int n) {
        // n > pick
        while(true) {
            int guessed = guess(n);
            if (guessed == -1) {
                n++;
            } else if (guessed == 1) {
                n--;
            }
            n = n / 2;
            if (guessed == 0) {
                System.out.println(n);
                return n;
            }
        }
    }
}