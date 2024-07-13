package com.java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {
    public static void main(String[] args) {
        String[] strArray = {"java", "springboot", "microservices","I love microservices"};
/**
 * to find the longest string in the given array.
 */
       String longestString= Arrays.stream(strArray).reduce((word1, word2)-> word1.length()>word2.length()?word1:word2).get();
       System.out.println("longestString "+longestString);

        /**
         * to find all the numbers starting with 1
         */
        int[] numbers={5,9,11,2,8,21,1};
        List<String> startsWith1 = Arrays.stream(numbers).boxed().map(s -> s + "")
        .filter(s -> s.startsWith("1"))
        .collect(Collectors.toList());

        System.out.println("startsWith1:"+startsWith1);




    }


}
