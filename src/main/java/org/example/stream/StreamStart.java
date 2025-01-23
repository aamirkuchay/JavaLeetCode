package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamStart {

    // stream is an java 8 features to process collections in functional and declarative manner. It simplifies data
    // processing, improve readability and maintainability, Enable easy parallelism without multithreading
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

// ============================CREATE STREAM =======================================================
     // 1 :=> form collections

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> streams = num.stream();

        // 1 :=> form Array
        String[] str = {"apple", "saqin","javid","dsjah"};
        Stream<String> stream = Arrays.stream(str);

        // 3 using Stream.of
        Stream<String> stre = Stream.of("ss","jad","gjd","demo");

        // 4 - infinite stream
        Stream<Integer> generate = Stream.generate(() -> 1).limit(100);
        List<Integer> number = Stream.iterate(1, x -> x + 1).limit(50).collect(Collectors.toList());
        System.out.println(number);


    }
}
