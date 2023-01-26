package com.programmers;
import java.util.HashMap;


//가장가까운글자
public class NearbyString {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String, Integer> alpha = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            String target = String.valueOf(s.charAt(i));
            if (alpha.get(target) == null) {
                alpha.put(target, i);
                answer[i] = -1;
            } else {
                answer[i] = i - alpha.get(target);
                alpha.put(target, i);
            }
        }

        return answer;
    }
}
