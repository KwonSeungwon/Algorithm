package com.programmers;

import java.util.ArrayList;
import java.util.List;

public class DistinctNumbers {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < arr.length; i++){
            if (num != arr[i]) {
                num = arr[i];
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // stream 을 이용한 array return
//        return list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
