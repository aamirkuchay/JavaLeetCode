package org.example.All;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static int[] findTopKElements (int[] num, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<k;i++){
            heap.add(num[i]);
        }

        for(int i=k;i<num.length;i++){
            if(num[i] > heap.peek()){
                heap.poll();
                heap.add(num[i]);
            }
        }

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = heap.poll();
        }
        return result;

    }


    public static void main(String[] args) {
 int[] num = {12,34,56,88,9,55,4};
 int k = 3;
 int[] result = findTopKElements(num,k);
 for(int r : result){
     System.out.println(r);
 }
    }





    }


