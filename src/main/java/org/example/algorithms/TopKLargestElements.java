package org.example.algorithms;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TopKLargestElements {

    public static int[] findTopKLargestElements(int[] nums, int k) {
        // Create a min heap
        // for smallest k element add comparator.reverseotrder
        //PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // Insert the first k elements into the heap
        for (int i = 0; i < k; i++) {
            heap.add(nums[i]);
        }


        // Process the remaining elements
        for (int i = k; i < nums.length; i++) {
            // for smallest k elements change to lessthan
            if (nums[i] > heap.peek()) {
                heap.poll();  // Remove the smallest element
                heap.add(nums[i]);  // Insert the larger element
            }
        }

        // Return the k largest elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {12,90,34,22,87,56,43};
        int k = 2;
        int[] result = findTopKLargestElements(nums, k);
        for (int num : result) {
            System.out.println(num);
        }

    }
    }

