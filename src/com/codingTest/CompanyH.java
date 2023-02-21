package com.codingTest;


public class CompanyH {

    // 세율구하는 문제
    public int solution(int[][] taxes, int income) {

        int answer = 0;
        answer +=  taxes[0][0] * ((double) taxes[0][1] / 100);
        for (int i = 1; i < taxes.length; i++) {
            int now = taxes[i][0];
            int before = taxes[i - 1][0];
            double taxPercent = ((double) taxes[i][1] / 100);
            if (now != 0 && now < income) {
                answer +=  (now - before)  * taxPercent;
            } else if (income > before && now > income) {
                answer +=  (income - before)  * taxPercent;
            } else if (now == 0 && income > before) {
                answer +=  (income - before)  * taxPercent;
            }
        }
        return answer;
    }

    //각 건물을 서로 볼수있냐없냐
    public int solution2(int[] heights) {

        int answer = 0;
        int maxHeight = 0;
        //right shift
        for (int i = 0; i < heights.length; i++) {
            int nowFloor = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (nowFloor < j && maxHeight < j) {
                    maxHeight = j;
                    answer++;
                }
            }
        }
        maxHeight = 0;
        //left shift
        for (int i = heights.length; i > 0; i--) {
            int nowFloor = i;
            for (int j = i - 1; j > 0; j--) {
                if (nowFloor < j && maxHeight < j) {
                    maxHeight = j;
                    answer++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

}