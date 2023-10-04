package org.example.leetcode.arrays;

import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;

public class SingleNumberSet {
    // in array 2 elements appear only once and others appear twice
    // we have to find number which is once
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 6, 6};
        Map<Integer,Integer> fre = new HashMap<>();
        for(int num: arr){
            fre.put(num, fre.getOrDefault(num,0)+ 1);
        }

//        for(Map.Entry<Integer,Integer> entry: fre.entrySet()){
//            int num = entry.getKey();
//            int count = entry.getValue();
//            System.out.println(num+""+ count);
//        }

        List<Integer> res = new LinkedList<>();
        for(int num :arr){
            if(fre.get(num) == 1){
                res.add(num);
            }
        }
        System.out.println(res);
    }

}
