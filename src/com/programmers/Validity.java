package com.programmers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Validity {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        LocalDate parsedToday = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        HashMap<String, Integer> termMap = convertTerms(terms);
        for(int i = 0; i < privacies.length; i++) {
            String[] dateAndType = privacies[i].split(" ");
            System.out.println(LocalDate.parse(dateAndType[0], DateTimeFormatter.ofPattern("yyyy.MM.dd")).plusMonths(termMap.get(dateAndType[1])));
            if (parsedToday.isAfter(LocalDate.parse(dateAndType[0], DateTimeFormatter.ofPattern("yyyy.MM.dd")).plusMonths(termMap.get(dateAndType[1])))) {
                answerList.add(i + 1);
            }
        }
        System.out.println(answerList);
        return answer;
    }

    private HashMap<String, Integer> convertTerms(String[] terms) {

        HashMap<String, Integer> termMap = new HashMap<>();
        for(String term : terms) {
            String[] newTerm = term.split(" ");
            termMap.put(newTerm[0], Integer.parseInt(newTerm[1]));
        }
        return termMap;
    }
}
