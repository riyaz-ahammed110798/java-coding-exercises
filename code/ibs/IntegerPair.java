package code.ibs;

import java.util.HashSet;
import java.util.Set;

/**
 * You are given an array of integers and a target sum. Write a Java program to find all unique pairs of elements in the array whose sum equals the target value.
 */

public class IntegerPair {
    static Set<String> pairNumber(int[] nums, int target){
        Set<Integer> num = new HashSet<>();
        Set<String> pair = new HashSet<>();
        for(int n : nums){
            int remaining = target - n;
            if(num.contains(remaining)){
                int min = Math.min(n, remaining);
                int max = Math.max(n, remaining);
                String paired = min + "," + max;
                if(!pair.contains(paired))
                    pair.add(paired);
            }
            num.add(n);
        }
        return pair;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,4,5,6,9,7,8};
        for (String s : pairNumber(nums, 7)){
            System.out.println(s);
        }


    }
}
