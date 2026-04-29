package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class Practise {

    public static String reverse(String str){
        String[] words = str.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for(int i = words.length -1 ; i>=0;i--){
            reverse.append(words[i]);
            if(i > 0){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }

    public static void main(String[] args) {

        String input = "I am Java";
        String output = reverse(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);



    }
}
