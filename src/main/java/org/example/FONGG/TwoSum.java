package org.example.FONGG;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // calculate the compliment of the current number
            int complement = target - nums[i];

            // check if compliemnt is already in the map
            if (map.containsKey(complement)) {
            // if found return the indecis of the compliment and the current number
                return new int[] { map.get(complement), i };
            }

            // otherwise add the  current number and its index to the map
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
