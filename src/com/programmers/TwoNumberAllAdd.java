package com.programmers;

import java.util.*;
import java.util.stream.Collectors;

//treeset을 이용하면 정렬을 따로할필요가없음.
public class TwoNumberAllAdd {
    public int[] solution(int[] numbers) {
        List<Integer> numberToList = new ArrayList<>();
        for (int i = 0 ; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                numberToList.add(numbers[i] + numbers[j]);
            }
        }
        numberToList.sort(Comparator.naturalOrder());
        List<Integer> distinctNumber = numberToList.stream().distinct().collect(Collectors.toList());
        int[] answer = new int[distinctNumber.size()];
        for (int i = 0; i < distinctNumber.size(); i++) {
            answer[i] = distinctNumber.get(i);
        }
        return answer;
    }
}
