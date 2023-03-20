package com.leetCode;

public class SumOfOneArray {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i != nums.length; i++) {
            int sum = nums[i];
            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            answer[i] = sum;
        }
        // 시간복잡도 O(n) / 공간복잡도 O(1)
        // for(int i=1;i<nums.length;i++){
        //      nums[i]=nums[i-1]+nums[i];
        //  }
        return answer;
    }
}
