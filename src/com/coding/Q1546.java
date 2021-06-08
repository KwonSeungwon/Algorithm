package com.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int subjectCount = Integer.parseInt(bufferedReader.readLine());
        String[] originalScore = bufferedReader.readLine().split(" ");
        double[] convertScore = new double[originalScore.length];
        for(int i = 0; i < originalScore.length; i++) {
            convertScore[i] = Double.parseDouble(originalScore[i]);
        }
        Arrays.sort(convertScore);
        double maxScore = convertScore[convertScore.length - 1];
        double sum = 0;
        for(int i = 0; i < convertScore.length; i++) {
            sum += convertScore[i] / maxScore * 100;
        }
        System.out.println(sum / subjectCount);
    }
}
