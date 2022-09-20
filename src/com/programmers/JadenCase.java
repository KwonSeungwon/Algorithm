package com.programmers;

import java.util.StringTokenizer;

public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s.toLowerCase();
        String[] splitWords = s.split("");
        String agoToken = null;
        for(String word : splitWords) {
            String thisWord = word;
            if (agoToken == null || agoToken.equals(" ")) {
                if (!Character.isDigit(thisWord.charAt(0))) {
                    answer.append(thisWord.toUpperCase());
                } else {
                    answer.append(thisWord);
                }
            } else {
                answer.append(thisWord);
            }
            agoToken = thisWord;
        }
        return answer.toString();
    }
    // 깔끔한 풀이(숫자도 걍 바꿈)
    /*
      String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
  }
     */


}
