package com.programmers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//개인정보 수집 유효기간
public class Validity {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();
        LocalDate parsedToday = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        HashMap<String, Integer> termMap = convertTerms(terms);
        for(int i = 0; i < privacies.length; i++) {
            String[] dateAndType = privacies[i].split(" ");
            LocalDate maximumDate = LocalDate.parse(dateAndType[0], DateTimeFormatter.ofPattern("yyyy.MM.dd")).plusMonths(termMap.get(dateAndType[1]));
            if (parsedToday.equals(maximumDate) || parsedToday.isAfter(maximumDate)) {
                answerList.add(i + 1);
            }
        }
        return answerList;
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
