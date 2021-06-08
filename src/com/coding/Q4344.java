package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int persons = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        int sum = 0;
        for(int i = 0; i < persons; i++) {
            sum = 0;
            String readData = bufferedReader.readLine();
            String[] scores = readData.split(" ");
            for(int j = 1; j < scores.length; j++) {
                sum += Double.parseDouble(scores[j]);
            }
            int avg = sum / Integer.parseInt(scores[0]);
            double target = 0;
            for(int k = 1 ; k < scores.length; k++) {
                if(Integer.parseInt(scores[k]) > avg) {
                    target++;
                }
            }
            String value = String.format("%.3f", target / (scores.length - 1) * 100);
            result.append(value).append("%").append("\n");
            sum = 0;
        }
        System.out.println(result);
        bufferedReader.close();
    }
}
