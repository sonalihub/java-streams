package com.java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class HighestNumber {
    public static void main(String[] args) {
        int[] numbers ={5,9,11,2,8, 21,1};


        /*
        to find the second highest number
         */
        Integer secondHighest=Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondHighest "+secondHighest);

        /*
        To find the second lowest number
         */
        Integer secondLowest=Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
        System.out.print("secondLowest "+secondLowest);
    }
}
