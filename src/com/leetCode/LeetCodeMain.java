package com.leetCode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LeetCodeMain {
    public static void main(String[] args) {

//        new SumOfOneArray().runningSum(new int[]{1,2,3,4});
//        new RichestCustomerWealth().maximumWealth(new int[][]{{1,5},{7,3},{3,5}});
//        new FizzBuzz().fizzBuzz(15);
//        new ReduceNumber().numberOfSteps(123);
//        new LinkedList().middleNode(new LinkedList.ListNode());
//        new RansomNote().canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi");
//        new RansomNote().canConstruct("aab", "baa");
//        new TwoSum().twoSum(new int[]{2,7,11,15}, 9);
//        new CoomonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"});
//        new Brackets().isValid("(]");
//        new AddNumberOne().plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
//        new AddNumberOne().romanToInt("IV");

        new LeetCodeMain().reformatDate("6th Jun 1933");
    }


    public String reformatDate(String date) {
        String[] dates = date.split(" ");
        dates[0] = dates[0].replaceAll("[^0-9]", "");
        LocalDate localDate = LocalDate.parse(dates[0] + dates[1] + dates[2], DateTimeFormatter.ofPattern("ddMMMyyyy", Locale.ENGLISH));
        return localDate.toString();

    }
}
