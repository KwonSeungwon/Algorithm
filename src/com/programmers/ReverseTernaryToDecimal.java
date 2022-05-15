package com.programmers;

public class ReverseTernaryToDecimal {
    public int solution(int n) {
        StringBuilder ternary = new StringBuilder();

        while(n > 0) {
            ternary.insert(0, (n % 3));
            n /= 3;
        }
        //Integer.parseInt(타겟, 진법) 진법자리에 진법을 주면 10진수로 변환
        return Integer.parseInt(new StringBuffer(ternary).reverse().toString(), 3);
    }
}
