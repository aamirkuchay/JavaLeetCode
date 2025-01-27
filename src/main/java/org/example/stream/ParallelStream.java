package org.example.stream;

import jdk.management.jfr.FlightRecorderMXBean;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {

    // A Type of stream that enables parallel processing of elements
    // Allowing multiple threads to process parts of the stream simultaneously which can improve performance
    // in large data set
    // workload is distributed accross multiple threads
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
//        list.stream().map(x -> factorial(x)).toList();
        List<Long> factorials = list.stream().map(ParallelStream::factorial).toList();
//        System.out.println(factorials);
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken with stream  " +  (endTime - startTime) + "ms");



        // now use Parallel stream ===================
       // parallel stream are most effective in CPU - intensive  or large datasets where tasks are independent
        long startTimes = System.currentTimeMillis();
        List<Integer> lists = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorial = list.parallelStream().map(ParallelStream::factorial).toList();
//        System.out.println(factorials);
        long endTimes = System.currentTimeMillis();
        System.out.println("Time Taken with Parallel stream  " +  (endTimes - startTimes) + "ms");



        // CUMULATIVE SUM ===========================

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
//        int sum = 0;
        // in lamda sum shows error because its not final now we use AtomicInteger
//        List<Integer> cumulativeSum = numbers.parallelStream().map(x -> {
//            int i = x + sum;
//            sum = i;
//            return i;
//
//        }).toList();

        AtomicInteger sum = new AtomicInteger(0);
//        List<Integer> cumulativeSum = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList();
        // parallel stream will shows wrong result bcoz its not indepedent
//        List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();
        List<Integer> cumulativeSum = numbers.stream().map(sum::addAndGet).sequential().toList();
        System.out.println(cumulativeSum);


    }

    private static long factorial(int n){
        long result = 1;
        for(int i=2; i<= n;i++){
            result *= i;
        }
        return  result;

    }

}
