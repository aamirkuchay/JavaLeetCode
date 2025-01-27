package org.example.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOptions {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // 1-  COLLECT ===================================
//        List<Integer> collect = list.stream().skip(1).collect(Collectors.toList());
//        System.out.println(collect);

        // 2-  FOREACH ===================================

//        list.stream().forEach(x -> System.out.println(x));

        // 3-  REDUCE -- combine elements to product single result ===================================
//        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
//        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
//        System.out.println(reduce.get());


        // 4-  ANY MATCH, ALL MATCH, NONE MATCH ===================================
//        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
//        System.out.println(b);
//        boolean b1 = list.stream().allMatch(x -> x > 0);
//        System.out.println(b1);
//        boolean b2 = list.stream().noneMatch(x -> x < 0);
//        System.out.println(b2);


        // 5-  FINDFIRST , FINDANY ===================================

//        List<Integer> list = Arrays.asList(1,2,3,4,5,65,7,8);
//
//        System.out.println(list.stream().findFirst().get());
//        System.out.println(list.stream().findAny().get());

        List<String> names = Arrays.asList("david","javid","mobile","bottle");
//        System.out.println(names.stream().filter(x -> x.length() > 3).toList());
        // Example - Squaring and Sorting numbers
        List<Integer> list = Arrays.asList(3,4,5,2,65,7,8,1);
//        System.out.println(list.stream().map(x -> x * x).sorted().toList());
//        Stream<Integer> integerStream = list.stream().map(x -> x * x);
//        Optional<Integer> reduce = integerStream.reduce(Integer::sum);
//        System.out.println(reduce);


        //Example : Counting Occurance of a Characters
        String sentence = "Hello World";
//        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        // 6 =  Peek  =====================
        // perform action on every element  as it is consumed
//        Stream.iterate(1,x -> x + 1 ).skip(10).limit(100).peek(System.out::println).count();

        // 7 =  toArray  =====================

        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8 =  min / max  =====================
        Optional<Integer> maxx = Stream.of(2, 44, 69).max((a ,b ) -> a - b); // for min use (b - a )
        Optional<Integer> max = Stream.of(2, 44, 69).max(Comparator.naturalOrder());
        Optional<Integer> min = Stream.of(2,1, 44, 69).min(Comparator.naturalOrder());
//        System.out.println(maxx);


        // Example -----
        // Stream cannot be used after a terminal operation has been called
//        Stream<String> stream = names.stream();
//        stream.forEach(System.out::println);
//        List<String> list1 = stream.map(String::toUpperCase).toList(); // exception error
//        System.out.println(list1);



        // 9 = forEachOrdered ===========================================
        //

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("using foreach with parallel stream");
//        list2.parallelStream().forEach(System.out::println);
        list2.parallelStream().forEachOrdered(System.out::println);


    }
}
