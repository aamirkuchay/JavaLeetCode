package org.example.leetcode.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums){
//     USING SORT METHOD nlogn MAKE IT Execute in more time
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;

        // DONE on oOfn
        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length -1;
        for(int k=nums.length-1;k>=0;k--){
           int comp1 = nums[i] * nums[i];
           int comp2 = nums[j]* nums[j];
           if(comp1 > comp2){
               ans[k] = comp1;
               i++;
           }else {
               ans[k] = comp2;
               j--;
           }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        int[] r = sortedSquares(nums);
        for(int d:r){
            System.out.println(d);
        }
    }
}
