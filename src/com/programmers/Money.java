package com.programmers;

public class Money {
    public long solution(int price, int money, int count) {
        long nowPrice = 0;
        for(int i = 1; i <= count; i++) {
            nowPrice += price * i;
        }
        long result = money - nowPrice;
//        Math.max(price * (count * (count + 1) / 2) - money, 0); // 좋아요많은거

        return result <= 0 ? Math.abs(result) : 0;
    }
}
