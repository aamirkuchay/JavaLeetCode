package org.example.All;
import java.util.*;



public class Main {
    public static int[] findtopK(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            heap.add(i);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] > heap.peek()){
                heap.poll();
                heap.add(nums[i]);
            }
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = heap.poll();
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] nums = {22,32,45,56,43,68,90,65,22,46,78};
        int k =3;
        int[] results = findtopK(nums,k);
        for(int n:results){
            System.out.println(n);
        }
    }}

