package com.programmers;

import java.time.LocalDate;

public class FindDayOfWeek {
    public String solution(int a, int b) {

        LocalDate dateTime = LocalDate.of(2016, a, b);
        return dateTime.getDayOfWeek().toString().substring(0, 3);
    }
    //감명받은코드
    public String getDayName(int a, int b) {
        String answer = "";
        switch(a) {
            case 1:
                if(b % 7 == 1)
                    answer = "FRI";
                else if(b % 7 == 2)
                    answer = "SAT";
                else if(b % 7 == 3)
                    answer = "SUN";
                else if(b % 7 == 4)
                    answer = "MON";
                else if(b % 7 == 5)
                    answer = "TUE";
                else if(b % 7 == 6)
                    answer = "WED";
                else
                    answer = "THU";
                break;
            case 2:
                if(b % 7 == 1)
                    answer = "MON";
                else if(b % 7 == 2)
                    answer = "TUE";
                else if(b % 7 == 3)
                    answer = "WED";
                else if(b % 7 == 4)
                    answer = "THU";
                else if(b % 7 == 5)
                    answer = "FRI";
                else if(b % 7 == 6)
                    answer = "SAT";
                else
                    answer = "SUN";
                break;
            case 3:
                if(b % 7 == 1)
                    answer = "TUE";
                else if(b % 7 == 2)
                    answer = "WED";
                else if(b % 7 == 3)
                    answer = "THU";
                else if(b % 7 == 4)
                    answer = "FRI";
                else if(b % 7 == 5)
                    answer = "SAT";
                else if(b % 7 == 6)
                    answer = "SUN";
                else
                    answer = "MON";
                break;
            case 4:
                if(b % 7 == 1)
                    answer = "THU";
                else if(b % 7 == 2)
                    answer = "FRI";
                else if(b % 7 == 3)
                    answer = "SAT";
                else if(b % 7 == 4)
                    answer = "SUN";
                else if(b % 7 == 5)
                    answer = "MON";
                else if(b % 7 == 6)
                    answer = "TUE";
                else
                    answer = "WED";
                break;
            case 5:
                if(b % 7 == 1)
                    answer = "SUN";
                else if(b % 7 == 2)
                    answer = "MON";
                else if(b % 7 == 3)
                    answer = "TUE";
                else if(b % 7 == 4)
                    answer = "WED";
                else if(b % 7 == 5)
                    answer = "THU";
                else if(b % 7 == 6)
                    answer = "FRI";
                else
                    answer = "SAT";
                break;
            case 6:
                if(b % 7 == 1)
                    answer = "WED";
                else if(b % 7 == 2)
                    answer = "THU";
                else if(b % 7 == 3)
                    answer = "FRI";
                else if(b % 7 == 4)
                    answer = "SAT";
                else if(b % 7 == 5)
                    answer = "SUN";
                else if(b % 7 == 6)
                    answer = "MON";
                else
                    answer = "TUE";
                break;
            case 7:
                if(b % 7 == 1)
                    answer = "FRI";
                else if(b % 7 == 2)
                    answer = "SAT";
                else if(b % 7 == 3)
                    answer = "SUN";
                else if(b % 7 == 4)
                    answer = "MON";
                else if(b % 7 == 5)
                    answer = "TUE";
                else if(b % 7 == 6)
                    answer = "WED";
                else
                    answer = "THU";
                break;
            case 8:
                if(b % 7 == 1)
                    answer = "MON";
                else if(b % 7 == 2)
                    answer = "TUE";
                else if(b % 7 == 3)
                    answer = "WED";
                else if(b % 7 == 4)
                    answer = "THU";
                else if(b % 7 == 5)
                    answer = "FRI";
                else if(b % 7 == 6)
                    answer = "SAT";
                else
                    answer = "SUN";
                break;
            case 9:
                if(b % 7 == 1)
                    answer = "THU";
                else if(b % 7 == 2)
                    answer = "FRI";
                else if(b % 7 == 3)
                    answer = "SAT";
                else if(b % 7 == 4)
                    answer = "SUN";
                else if(b % 7 == 5)
                    answer = "MON";
                else if(b % 7 == 6)
                    answer = "TUE";
                else
                    answer = "WED";
                break;
            case 10:
                if(b % 7 == 1)
                    answer = "SAT";
                else if(b % 7 == 2)
                    answer = "SUN";
                else if(b % 7 == 3)
                    answer = "MON";
                else if(b % 7 == 4)
                    answer = "TUE";
                else if(b % 7 == 5)
                    answer = "WED";
                else if(b % 7 == 6)
                    answer = "THU";
                else
                    answer = "FRI";
                break;
            case 11:
                if(b % 7 == 1)
                    answer = "TUE";
                else if(b % 7 == 2)
                    answer = "WED";
                else if(b % 7 == 3)
                    answer = "THU";
                else if(b % 7 == 4)
                    answer = "FRI";
                else if(b % 7 == 5)
                    answer = "SAT";
                else if(b % 7 == 6)
                    answer = "SUN";
                else
                    answer = "MON";
                break;
            case 12:
                if(b % 7 == 1)
                    answer = "THU";
                else if(b % 7 == 2)
                    answer = "FRI";
                else if(b % 7 == 3)
                    answer = "SAT";
                else if(b % 7 == 4)
                    answer = "SUN";
                else if(b % 7 == 5)
                    answer = "MON";
                else if(b % 7 == 6)
                    answer = "TUE";
                else
                    answer = "WED";
                break;
        }
        return answer;
    }
}
