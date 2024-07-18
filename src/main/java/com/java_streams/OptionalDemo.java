package com.java_streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalDemo {
    public static void main(String[] args) {

        //creating of optional objects
        Optional<Integer> opInt = Optional.of(2);
        OptionalDouble optionalDouble = OptionalDouble.of(2d);
        OptionalInt opInt2 = OptionalInt.of(4);
        System.out.println(opInt);
        System.out.println(optionalDouble);
        System.out.println(opInt2);
        /**
         *  OrElse method takes a parameter which will be returned if the optional doesn’t have value.
         *  OrElseGet method needs a function which will be executed to return value if the optional doesn’t have value.
         *  This shows that orElse method needs a value and orElseGet method needs supplier functions.
         */

        //when the optional object is null
        Optional<String> optional = Optional.ofNullable(null);
        String orElseResult = optional.orElse(getName());
        System.out.println("orElseResult " + orElseResult);
        String orElseGetResult = optional.orElseGet(() -> getName());
        System.out.println("orElseGetResult " + orElseGetResult);

        //when optional object is not null
        Optional<String> optionalWithVal = Optional.ofNullable("value");
        orElseResult = optionalWithVal.orElse(getName());
        System.out.println("orElseResult " + orElseResult);
        orElseGetResult = optionalWithVal.orElseGet(() -> getName());
        System.out.println("orElseGetResult " + orElseGetResult);

    }

    public static String getName() {
        System.out.println("-------------This method got executed-----------");
        return "default name";
    }
}
