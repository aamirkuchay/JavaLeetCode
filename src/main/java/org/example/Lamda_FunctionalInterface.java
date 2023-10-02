package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface  Adder{
    int add(int a, int b);

    default String getDescription() {
        return "Perform a math operation on two integers.";
    }

    static Adder sub() {
        return (a, b) -> a - b;
    }
}


public class Lamda_FunctionalInterface {
    public static void main(String[] args) {
        Adder adder = (a,b) -> a+b;
        int result = adder.add(2,1);
        System.out.println(result);
        System.out.println(adder.getDescription());


//
//        List<Integer> numbers = Arrays.asList(2,4,6,8,9);
//        Predicate<Integer> isEven = number -> number % 2 == 0;
//        List<Integer> result2 = numbers.stream().filter(isEven).collect(Collectors.toList());
//        System.out.println(result2);

//        String name = "Aamir";
//        StringBuffer sb = new StringBuffer(name);
//        sb.reverse();
//        System.out.println(sb);


    }
}
