package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;





//오븐시계
public class Q2525 {
    public static void functionalSolution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] data = reader.readLine().split(" ");
        LocalTime time = LocalTime.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
        String minute = reader.readLine();
        String result = time.plusMinutes(Integer.parseInt(minute)).format(DateTimeFormatter.ofPattern("H m"));
        System.out.println(result);
    }

    public static void conditionSolution() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] time = reader.readLine().split(" ");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int timeTaken = Integer.parseInt(reader.readLine());
        int addTime = 0;
        int resultMinute = 0;
        int resultTime = 0;
        if ((minute + timeTaken) % 60 != 0) {
            resultMinute = (minute + timeTaken) % 60;
        }
        addTime = (minute + timeTaken) / 60;


    }

    public static void main(String[] args) throws IOException {
        functionalSolution(); //내장함수이용
    }
}
