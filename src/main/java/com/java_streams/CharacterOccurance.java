package com.java_streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurance {
    public static void main(String[] args) {
        String input="ilovejavatechie";
        //To find the occurance of each character in a string
        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //to find all the duplicate element from the given string
        List<String> duplicates = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("duplicates"+duplicates);

        //to find all the elements in the string that are unique
        List<String> uniqueElements = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("unique Elements"+uniqueElements);

        //find first non repeated element in the string
        String firstNonRepeated = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() ==1).findFirst().get().getKey();
        System.out.println("first Non Repeated Element "+firstNonRepeated);

        //find first repeated element in the string
        String firstUniqueElement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get().getKey();
        System.out.println("firstUniqueElement "+firstUniqueElement);
    }
}
