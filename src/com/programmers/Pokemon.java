package com.programmers;

import java.util.*;
import java.util.stream.Collectors;

//폰켓몬
public class Pokemon {

    public int solution(int[] nums) {
        int possiblePokemon = nums.length / 2;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        return set.size() > 2 ? possiblePokemon : set.size();
    }
}
