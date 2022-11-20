package com.aditya;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) { // time limit exceeded

        for(int i = 0; i<nums.length-1; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums [j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean cOntainsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i< nums.length; i++) {
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}
