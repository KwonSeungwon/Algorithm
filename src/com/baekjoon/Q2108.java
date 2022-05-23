package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

//통계학
public class Q2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(reader.readLine());
        int[] numbers = new int[count];
        float sum = 0;
        for(int i = 0; i < count; i++) {
            int intVal = Integer.parseInt(reader.readLine());
            numbers[i] = intVal;
            sum += intVal;
        }
        Arrays.sort(numbers);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer a : numbers) {
            map.merge(a, 1, Integer::sum);
        }
        boolean flag = false;
        int feq = 0;
        map.forEach((a,b) -> {
            if(b > feq || b == feq) {
            }
        });




        //        writer.append(String.valueOf(Math.round(sum / count))).append("\n"); // 평균
//        writer.append(String.valueOf(numbers[(count) / 2])).append("\n"); // 중위수
////        writer.append(String.valueOf("최빈값").append("\n"); // 최빈값
//        writer.append(String.valueOf(numbers[count - 1] - numbers[0])); // 범위
        
        writer.flush();
        reader.close();
        writer.close();
        
    }
}
