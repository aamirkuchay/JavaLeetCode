package org.example.leetcode.arrays;

import java.util.Scanner;

public class CandyProblem {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); // Number of children
//        int[] candies = new int[n];
//
//        // Input: Read the array of candies
//        for (int i = 0; i < n; i++) {
//            candies[i] = scanner.nextInt();
//        }
//
//        int totalCandies = 0;
//        int currentCandies = 1; // Rahul always gives 1 candy to the first child
//
//        // Start distributing candies from the second child
//        for (int i = 1; i < n; i++) {
//            if (candies[i] > candies[i - 1]) {
//                currentCandies++; // Give 1 more candy than the previous child
//            } else {
//                currentCandies = 1; // Reset to 1 if the condition is not met
//            }
//            totalCandies += currentCandies; // Add candies to the total
//        }
//
//        System.out.println("Total minimum candies distributed by Rahul: " + totalCandies);
//
//        scanner.close();
//    }



    public static void main(String[] args) {
        int n = 6; // Number of children
        int[] candies = { 2, 3, 4, 3, 2, 1 };

        int totalCandies = 0;
        int currentCandies = 1; // Rahul always gives 1 candy to the first child

        // Start distributing candies from the second child
        for (int i = 1; i < n; i++) {
            if (candies[i] > candies[i - 1]) {
                currentCandies++; // Give 1 more candy than the previous child
            } else {
                currentCandies = 1; // Reset to 1 if the condition is not met
            }
            totalCandies += currentCandies; // Add candies to the total
        }

        System.out.println("Total minimum candies distributed by Rahul: " + totalCandies);
    }
}
