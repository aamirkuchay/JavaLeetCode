package org.example.All;
import java.util.*;



public class Main {

    public static void main(String[] args) {

        int[] arr = {6,23,45,23,57,78,77,32};

        int large = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > large){
                second = large;
                large = arr[i];
            } else if (arr[i] > second && arr[i] < large) {
                second = arr[i];
            }

        }
        System.out.println(large);
        System.out.println(second);



    }}

