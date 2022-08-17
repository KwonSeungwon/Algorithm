package com.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BusinessCard {
    public int solution(int[][] sizes) {
        List<Integer> width = new ArrayList<>();
        List<Integer> height = new ArrayList<>();
        for(int i = 0; i < sizes.length; i++) {
            width.add(Math.max(sizes[i][0] , sizes[i][1]));
            height.add(Math.min(sizes[i][0] , sizes[i][1]));
        }
        Collections.sort(width);
        Collections.sort(height);
        return width.get(width.size() - 1) * height.get(height.size() - 1);
    }
}
