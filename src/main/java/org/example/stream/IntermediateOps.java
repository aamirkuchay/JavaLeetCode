package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    // Intermediate operations converts Stream into another Stream
    // They are Lazy, means they dont execute untill a terminal operation is invoked
    public static void main(String[] args) {
        // 1 = FILTER ========
//        List<String>  name = Arrays.asList("deew","fff","ffd","dde");
//        Stream<String> filteredStream = name.stream().filter(x -> x.startsWith("d"));
//        d.forEach(x -> System.out.println(x));
//        filteredStream.forEach(System.out::println);

        // 2 = MAP ==============
//        List<String>  names = Arrays.asList("deew","fff","ffd","dde");
//        List<String> collect = names.stream().map(x -> x.toUpperCase()/).toList();
//        List<String> collect = names.stream().map(String::toUpperCase).toList();
//        collect.forEach(System.out::println);


        // 3 = SORTED ==============
//        List<String>  names = Arrays.asList("aamir","basit","khalid","sajid");
//        Stream<String> sorted = names.stream().sorted();
//        Stream<String> sortedusingComparitor = names.stream().sorted((a, b) -> a.length() - b.length());
//        sorted.forEach(System.out::println);

        // 4 = DISTINCT ==============
        List<String>  names = Arrays.asList("aamir","basit","khalid","sajid","basit");
        List<String> a = names.stream().filter(x -> x.startsWith("b")).distinct().toList();
        System.out.println(a);
        // 4 = DISTINCT ==============
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).limit(20);
        Stream<Integer> limits = Stream.iterate(1, x -> x + 1).skip(10).limit(20);
        limits.forEach(System.out::println);


        // 9 = flatMap ======================================================
//     // Handle Stream of collections , lists or arrays where each element is itself a collection
        //Flatten nested structures (e.g list within list) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at same time

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear","grape")
        );
//        List<String> list1 = listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList();
//        List<String> list1 = listOfLists.stream().flatMap(Collection::stream).map(String::toUpperCase).toList();
//        List<String> list1 = listOfLists.stream().flatMap(Collection::stream).map(x -> {
//            return x;
//        }).toList();

//        System.out.println(list1);


        List<String> seprateLists = Arrays.asList("hello world", "java programming are the one", "the best of bests");
        List<String> sep = seprateLists.stream().flatMap(seperate -> Arrays.stream(seperate.split(" "))).map(String::toUpperCase).toList();
        System.out.println(sep);


    }
}
