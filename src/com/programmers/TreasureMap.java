package com.programmers;



//보물지도
public class TreasureMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String fomrat = "%0" + n + "d";
        for(int i = 0; i < n; i++) {
            String one = String.format(fomrat, Long.valueOf(Long.toBinaryString(arr1[i])));
            String two = String.format(fomrat, Long.valueOf(Long.toBinaryString(arr2[i])));
            answer[i] = String.format(fomrat, Long.parseLong(one) + Long.parseLong(two)).replace("0" ," ").replaceAll("[1-2]", "#");
        }
        return answer;
    }
}
