package com.programmers;

public class PhoneNumberEncryption {
    public String solution(String phone_number) {
        //반복문 이용
//        for(int i = 0; i < phone_number.substring(0, phone_number.length() - 4).length(); i++) {
//            result += "*";
//        }
        //replace
        String back = phone_number.substring(phone_number.length() - 4);
        String front = phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*");
//        phone_number.replaceAll(".(?=.{4})", "*"); //축약버전
        return front + back;
//        return result + phone_number.substring(phone_number.length() - 4);
    }
}
