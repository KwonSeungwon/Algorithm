package com.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//정렬2
public class Q2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i <range; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        list.sort(Comparator.naturalOrder());

        for(int i = 0; i < list.size(); i++) {
            writer.append(list.get(i).toString()).append("\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
