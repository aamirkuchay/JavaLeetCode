package org.example.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        // 1= Collectors =====================================
        // Collectors is a utility class
        // provide set of methods to create common methods

        List<String> names = Arrays.asList("bob","sob","dob");

        List<String> b = names.stream().filter(n -> n.startsWith("b")).collect(Collectors.toList());
//        System.out.println(b);

        // Collecting to set -------------------
        List<Integer> digits = Arrays.asList(1,2,2,3,4,4,5,6,6);
        Set<Integer> collect = digits.stream().collect(Collectors.toSet());
//        System.out.println(collect);

        // Collecting to spacific collection --------
        ArrayDeque<String> collect1 = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect1);

        // 4 Joining String -----------------------------
        // concatinate stream elements into a single string
//        String collect2 = names.stream().map(x -> x.toUpperCase()).collect(Collectors.joining());
        String collect2 = names.stream().map(String::toUpperCase).collect(Collectors.joining());
        String collect3 = names.stream().map(String::toUpperCase).collect(Collectors.joining(","));
//        System.out.println(collect3);

        // 4 = Summarising Data -------------------------
        // Generate statical summary (count, sum, min, avarage, max)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        // Average ----------
        numbers.stream().collect(Collectors.averagingInt(x -> x));
        // Count ----------
        numbers.stream().collect(Collectors.counting());
        System.out.println(stats);


        // 8 =  Grouping Elements =======================
        List<String> list = Arrays.asList("java","hello","java","world","streams","collecting");
        Map<Integer, List<String>> collect5 = list.stream().collect(Collectors.groupingBy(x -> x.length()));

//        System.out.println( list.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(", "))));
//        System.out.println( list.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));
        TreeMap<Integer, Long> treeMap = list.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
//        System.out.println( treeMap);


        Map<String, Long> collect4 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect4);


        // 9  Partitioning Elements =================
        //Partitioning elements into 2 groups (true, false) based on predicate
        Map<Boolean, List<String>> patition = list.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
//        System.out.println(patition);

        // 10 = Mapping and Collecting ==============
        // Applies mapping  function before collecting
//        List<String> collect6 = list.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        List<String> collect6 = list.stream().map(String::toUpperCase).toList();


//        System.out.println(collect6);





//        Example 1:= Countinh word occurance ===================
         String str = " i am the developer of the development field";

        System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Example 2:- Partition even nd odd number
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list1.stream().collect(Collectors.partitioningBy(x -> x%2 == 0)));

        //Example 3:- Summing values in a map
        Map<String,Integer> maps = new HashMap<>();
        maps.put("Apple",10);
        maps.put("Banana", 20);
        maps.put("Orange", 30);
        System.out.println( maps.values().stream().reduce(Integer::sum));
        System.out.println(maps.values().stream().collect(Collectors.summarizingInt(x -> x)));

        //Example 4:- Create a map from dtream elements
        List<String> fruits = Arrays.asList("apple","banana","pear");
        fruits.stream().collect(Collectors.toMap())


    }
}
