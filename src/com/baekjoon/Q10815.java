package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

//숫자 카드
public class Q10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        StringTokenizer had = new StringTokenizer(reader.readLine());
        Set<Integer> set = new HashSet<>();
        while (had.hasMoreTokens()) {
            set.add(Integer.parseInt(had.nextToken()));
        }
        reader.readLine();
        StringTokenizer target = new StringTokenizer(reader.readLine());
        while (target.hasMoreTokens()) {
            if (set.contains(Integer.parseInt(target.nextToken()))) {
                writer.append("1 ");
            } else {
                writer.append("0 ");
            }
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}
