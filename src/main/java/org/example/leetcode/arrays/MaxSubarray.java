package org.example.leetcode.arrays;

public class MaxSubarray {
 // The Sum of The Max Subarray in the nums;
    public static int[] maxSubarray(int[] nums){
        int cmax = 0;  //current x
        int omax = Integer.MIN_VALUE;   // max x

        for(int i=0;i<nums.length;i++){
            if(cmax < 0){
                cmax = nums[i];
            }else {
                cmax = cmax+ nums[i];
            }

            omax = Math.max(omax,cmax);
        }
        return new int[]{omax};

    }

    public static void main(String[] args) {
        int[] nums = {-2,1-3,4,-1,2,1,-5,4};
        int[] r = maxSubarray(nums);
        for(int f:r){
            System.out.println(f);
        }
    }
}
