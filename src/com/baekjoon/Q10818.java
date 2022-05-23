package com.baekjoon;
import java.io.*;
import java.util.Arrays;

public class Q10818 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        String[] value = reader.readLine().split(" ");
        int[] result = Arrays.asList(value).stream().mapToInt(Integer::parseInt).toArray();
        Arrays.sort(result);
        System.out.println(result[0] + " " + result[result.length -1]);

//		while((str = reader.readLine()) != null) {
//		}
//		writer.close();
    }
}
