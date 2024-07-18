package com.java_streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalDemo {
    public static void main(String[] args) {

        //creating of optional objects
        Optional<Integer> opInt= Optional.of(2);
        OptionalDouble optionalDouble = OptionalDouble.of(2d);
        OptionalInt opInt2=OptionalInt.of(4);
        System.out.println(opInt);
        System.out.println(optionalDouble);
        System.out.println(opInt2);

    }
}
