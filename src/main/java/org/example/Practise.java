package org.example;


import java.util.Arrays;

public class Practise {
    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int middle = (left+right) / 2;
            if(array[middle] == target){
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else if (array[middle] > target) {
                right = middle - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] number = {2,4,57,89,906,5,4};
        int tareget = 3;
        int result = binarySearch(number,tareget);
        System.out.println(result);

    }
}

