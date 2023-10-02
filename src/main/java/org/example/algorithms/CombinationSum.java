package org.example.algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    //using dynamic programming

        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates); // Sort the candidates array in ascending order
            backtrack(result, new ArrayList<>(), candidates, target, 0);
            return result;
        }

        private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remaining, int start) {
            if (remaining < 0) {
                return;
            } else if (remaining == 0) {
                result.add(new ArrayList<>(tempList));
            } else {
                for (int i = start; i < candidates.length; i++) {
                    tempList.add(candidates[i]);
                    backtrack(result, tempList, candidates, remaining - candidates[i], i); // Allow reuse of same elements
                    tempList.remove(tempList.size() - 1);
                }
            }
        }

        public static void main(String[] args) {
            int[] candidates = {2, 3, 6, 7};
            int target = 7;
            List<List<Integer>> combinations = combinationSum(candidates, target);
            System.out.println("Combinations that sum up to " + target + ":");
            for (List<Integer> combination : combinations) {
                System.out.println(combination);
            }
        }
    }


