package org.example.All;
import java.util.*;



public class Main {

public static int[] findTopK(int[] nums, int k){
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

    int[] r = new int[k];
    for(int i=0;i<k;i++){
        r[i] = heap.poll();
    }
    return r;
}

    public static void main(String[] args) {
        int[] nums = {22,32,45,56,43,68,90,65,22,46,78};
        int k =3;
        int[] r= findTopK(nums,k);
        for(int i:r){
            System.out.println(i);
        }

    }}

