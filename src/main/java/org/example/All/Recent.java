package org.example.All;

import java.util.HashMap;
import java.util.Map;

public class Recent {

//    public static void main(String[] args) {

        // find the duplicate elements using Hashmap=============

//        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
//        Map<Integer,Integer> maps = new HashMap<>();
//
//        for(int i : arr){
//            maps.put(i,maps.getOrDefault(i,0)+ 1);
//        }
//        System.out.println("Duplicate Elements are");
//
//        for(int key: maps.keySet()){
//            if(maps.get(key) > 1){
//                System.out.println(key + "  ");
//            }
//        }


        //  Find the missing number =====================

//        int[] arr = {1, 2, 4, 5, 6,7};
//        int n = 7;
//        int expectedNumber = n*(n+1)/2;
//        int actualSum = 0;
//
//        for(int i : arr){
//             actualSum += i;
//        }
//
//        int missingNumber = expectedNumber - actualSum;
//        System.out.println(missingNumber);


        // Function to find two numbers that add up to target =====================
        public static int[] twoSum(int[] num , int target){
            HashMap<Integer,Integer> maps = new HashMap<>();
            for(int i=0;i<num.length;i++){
                int compliment = target - num[i];

                // Check if the complement exists in the map
                if(maps.containsKey(compliment)){
                    return new int[]{maps.get(compliment), i};
                }
                // Otherwise, store the current number and its index
                maps.put(num[i],i);
            }
            return new int[]{};
        }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;

        int[] result = twoSum(nums,target);


        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }




















}
