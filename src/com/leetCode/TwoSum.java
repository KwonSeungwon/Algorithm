package com.leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i != nums.length; i++) {
//            for(int j = i + 1; j != nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;
//    }
        // O(n) 시간복잡도
        // target - nums[i]를 해서 계속 map에 넣어주다가 2회차 부터 합쳐서 타겟값이 되기 위한 값이 맵에 있으면 해당 맵의 idx와 현재 idx를 리턴
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
