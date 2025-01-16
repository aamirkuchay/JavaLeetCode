package org.example.linkedin;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    public static int[] twoSum(int[] nums , int target) throws IllegalAccessException {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalAccessException("No two Sum solution");
    }
    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] result = twoSum(nums,target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }
}
