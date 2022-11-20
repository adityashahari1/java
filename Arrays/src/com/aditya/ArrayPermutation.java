package com.aditya;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        arrayP(nums);
    }
    static void arrayP(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        for(int i = 0; i<nums.length; i++) {
            System.out.print((ans[i]+ " "));
        }
    }
}
