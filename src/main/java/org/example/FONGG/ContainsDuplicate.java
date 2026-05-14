package org.example.FONGG;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> duplicateList = new HashSet<>();
        for(int i: nums){
            if(duplicateList.contains(i)){
                return true;
            }
            duplicateList.add(i);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,1};

        ContainsDuplicate cd = new ContainsDuplicate();
        boolean b = cd.containsDuplicate(num);
        System.out.println(b);

    }
}
