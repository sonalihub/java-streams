package com.java_streams;

import java.util.Arrays;

public class StringLength {
    public static void main(String[] args) {
        String[] strArray = {"java", "springboot", "microservices","I love microservices"};

       String longestString= Arrays.stream(strArray).reduce((word1, word2)-> word1.length()>word2.length()?word1:word2).get();
       System.out.print("longestString "+longestString);
    }
}
