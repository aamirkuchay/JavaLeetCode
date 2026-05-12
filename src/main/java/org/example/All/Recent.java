package org.example.All;

import java.util.*;
import java.util.stream.Collectors;

public class Recent {


//    public static void main(String[] args) {

        //✅ find the duplicate elements using Hashmap=============

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


        //✅  Find the missing number =====================

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


        //✅ Function to find two numbers that add up to target =====================
//        public static int[] twoSum(int[] num , int target){
//            HashMap<Integer,Integer> maps = new HashMap<>();
//            for(int i=0;i<num.length;i++){
//                int compliment = target - num[i];
//
//                // Check if the complement exists in the map
//                if(maps.containsKey(compliment)){
//                    return new int[]{maps.get(compliment), i};
//                }
//                // Otherwise, store the current number and its index
//                maps.put(num[i],i);
//            }
//            return new int[]{};
//        }
//
//    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 17;
//
//        int[] result = twoSum(nums,target);
//
//
//        if (result.length == 2) {
//            System.out.println("Indices: " + result[0] + ", " + result[1]);
//            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
//        } else {
//            System.out.println("No two numbers add up to the target.");
//        }
//    }



    //✅ Function to find maximum subarray sum using Kadane’s Algorithm======================

//    public static int maxSubArray(int[] nums){
//        int currentSum = nums[0];
//        int maxSum = nums[0];
//        for(int i=1;i<nums.length;i++){
//            // Either extend the current subarray or start a new one
//            currentSum = Math.max(nums[i], currentSum + nums[i]);
//            maxSum = Math.max(maxSum, currentSum);
//        }
//        return maxSum;
//
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//
//        int result = maxSubArray(nums);
//
//        System.out.println("Maximum Subarray Sum: " + result);
//    }




    // ✅ Method 2: Use character frequency counting (more efficient)
//    public static boolean isAnagramCount(String s1, String s2) {
//        if (s1.length() != s2.length()) return false;
//
//        int[] count = new int[26]; // assuming lowercase English letters
//
//        for (int i = 0; i < s1.length(); i++) {
//            count[s1.charAt(i) - 'a']++;
//            count[s2.charAt(i) - 'a']--;
//        }
//
//        // If all counts are zero, they are anagrams
//        for (int c : count) {
//            if (c != 0) return false;
//        }
//        return true;
//    }


    //✅ Function to reverse words in a sentence
//    public static String reverseWords(String sentence) {
//        // Trim to remove extra spaces at start/end
//        String[] words = sentence.trim().split("\\s+"); // split by one or more spaces
//        StringBuilder reversed = new StringBuilder();
//
//        // Reverse order of words
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]);
//            if (i > 0) reversed.append(" ");
//        }
//
//        return reversed.toString();
//    }
//
//    // Main method for testing
//    public static void main(String[] args) {
//        String input = "I am Java";
//        String output = reverseWords(input);
//
//        System.out.println("Original: " + input);
//        System.out.println("Reversed: " + output);
//    }


    //✅ Function to check if brackets are balanced
//    public static boolean isBalanced(String str) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : str.toCharArray()) {
//            // Push opening brackets
//            if (ch == '(' || ch == '[' || ch == '{') {
//                stack.push(ch);
//            }
//            // Handle closing brackets
//            else if (ch == ')' || ch == ']' || ch == '}') {
//                if (stack.isEmpty()) return false;
//
//                char top = stack.pop();
//                // Check for matching pairs
//                if ((ch == ')' && top != '(') ||
//                        (ch == ']' && top != '[') ||
//                        (ch == '}' && top != '{')) {
//                    return false;
//                }
//            }
//        }
//
//        // If stack is empty → all brackets matched
//        return stack.isEmpty();
//    }
//
//    // Main method for testing
//    public static void main(String[] args) {
//        String s1 = "{[()]}";
//        String s2 = "{[(])}";
//        String s3 = "((()))[]{}";
//
//        System.out.println(s1 + " → " + isBalanced(s1)); // true
//        System.out.println(s2 + " → " + isBalanced(s2)); // false
//        System.out.println(s3 + " → " + isBalanced(s3)); // true
//    }

    //✅ Function to compress a string
//    public static String compress(String s) {
//        if (s == null || s.isEmpty()) return "";
//
//        StringBuilder result = new StringBuilder();
//        int count = 1;
//
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                count++;
//            } else {
//                result.append(s.charAt(i - 1)).append(count);
//                count = 1; // reset count
//            }
//        }
//
//        // Append the last character and its count
//        result.append(s.charAt(s.length() - 1)).append(count);
//
//        return result.toString();
//    }
//
//    public static void main(String[] args) {
//        String input = "aaabbc";
//
//        System.out.println("Original: " + input);
//        System.out.println("Compressed (with 1s): " + compress(input));
//    }


    //✅ make all 0 to the rightside --------------------------
//    List<Integer> number = List.of(1,0,-3,0,5,-2,0,8,0,-4);
//    List<Integer> result = number.stream().sorted(Comparator.comparingInt(n -> n ==0?1:0)).toList();



// ✅ sort the map by value and key ==========================
//    Map<String, Integer> maps = new HashMap<>();
//        map.put("Apple", 5);
//        map.put("Banana", 2);
//        map.put("Orange", 8);
//        map.put("Mango", 3);
//
//    Map<String,Integer> sortByValue = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
//            .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));

















}
