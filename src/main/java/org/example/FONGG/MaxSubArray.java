package org.example.FONGG;

import java.util.Arrays;

public class MaxSubArray {

    public static int[] productExceptSelf(int[] nums){

        int[] result = new int[nums.length];

        int pre = 1, post = 1;

        // Prefix products
        for(int i = 0; i < nums.length; i++){
            result[i] = pre;
            pre = nums[i] * pre;
        }

        // Postfix products
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] = result[i] * post;
            post = post * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] ans = productExceptSelf(nums);

        // Print array
        System.out.println(Arrays.toString(ans));
    }

}
