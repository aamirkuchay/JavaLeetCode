package org.example;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        String input = "abc";
        List<String> combinations = generateCombinations(input);
        System.out.println(combinations);
    }

    public static List<String> generateCombinations(String input) {
        List<String> combinations = new ArrayList<>();
        generateCombinationsHelper(input, "", combinations);
        return combinations;
    }

    private static void generateCombinationsHelper(String input, String current, List<String> combinations) {
        if (input.isEmpty()) {
            combinations.add(current);
            return;
        }
//
//        // Include the first character
        generateCombinationsHelper(input.substring(1), current + input.charAt(0), combinations);
//
//        // Exclude the first character
        generateCombinationsHelper(input.substring(1), current, combinations);
    }


}
