package org.example.leetcode.arrays;

import java.util.List;

public class MajorityElements {
//    // those elements which occurs more than n/2 n->length of array
    public static int majorityElements(int[] nums){
        int val = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                val = nums[i];
                count = 1;
            } else if (nums[i] == val) {
                count++;
            }else {
                count--;
            }
        }
        return val;
    }


    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1};
        int r = majorityElements(nums);
        System.out.println(r);
    }
}
