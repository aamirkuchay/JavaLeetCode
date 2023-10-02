package org.example.leetcode.arrays;

public class RotrateArray {
    public static int[] rotrate(int[] nums, int k) {
         int n = nums.length;
         k = k%n;
        reversepart(nums, 0, n - 1);
        reversepart(nums, 0, k - 1);
        reversepart(nums, k, n - 1);
        return nums;
    }

    public static void reversepart(int[] nums,int start,int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] nums = {2,4,5,7,8,9};
        int k = 3;
       int[] r = rotrate(nums,k);
       for(int b:r){
           System.out.println(b);
       }
    }

}

