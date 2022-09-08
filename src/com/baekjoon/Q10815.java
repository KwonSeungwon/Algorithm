package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//숫자 카드
public class Q10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        StringTokenizer hadTokenizer = new StringTokenizer(reader.readLine());
        int cardCount = Integer.parseInt(reader.readLine());
        StringTokenizer targetTokenizer = new StringTokenizer(reader.readLine());
        Map<String, Integer> map = new HashMap<>();
        while (targetTokenizer.hasMoreTokens()) {
            map.put(targetTokenizer.nextToken(), 0);
        }
        while(hadTokenizer.hasMoreTokens()) {
            if (map.get(hadTokenizer.nextToken()) != null) {
                System.out.println("in");
                map.replace(hadTokenizer.nextToken(), 1);
            }
        }
        'sader.close();qq0
        writer.flush();
        writer.close();
    }
}
