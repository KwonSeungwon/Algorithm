package com.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Finisher {
    public String solution(String[] participant, String[] completion) {
//        List<String> participantToList = Arrays.stream(participant).collect(Collectors.toList());
//        List<String> completionToList = Arrays.stream(completion).collect(Collectors.toList());
//        for(String a : completionToList) {
//            if(participantToList.contains(a)) {
//                participantToList.remove(a);
//            }
//        }
        String answer = "";
//        HashMap<String, String> complete = new HashMap<>();
//        for(String a : completion) {
//            complete.put(a, a);
//        }
//        for(String a : participant) {
//            if (complete.get(a) != null) {
//                complete.remove(a);
//            } else {
//                answer = a;
//            }
//        }
        String partic = Arrays.toString(participant);
        for(String a : completion) {
            partic = partic.replaceFirst(a, "");
        }
        answer = partic.replace(",","");
        answer = answer.replace("[","");
        answer = answer.replace("]","").trim();
        return answer;
    }
}
