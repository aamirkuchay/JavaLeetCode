package org.example;


import com.sun.jdi.event.StepEvent;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise {

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

