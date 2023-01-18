package com.programmers;

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] basicWord = new String[]{"aya", "ye", "woo", "ma"};

        for(String word : babbling) {
            for(String bw : basicWord) {
                if (word.contains(bw) && word.length() - word.replace(bw, "").length() == bw.length()) {
                    word = word.replace(bw, "");
                }
            }
            if(word.equals("")) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
