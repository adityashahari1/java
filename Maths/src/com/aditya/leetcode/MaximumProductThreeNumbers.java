package com.aditya.leetcode;

import java.util.Arrays;

public class MaximumProductThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-100,-2,-3,1};
        System.out.println(maximumProd(nums));
    }

    static int maximumProduct(int[] nums) {

        for(int i = 0; i<nums.length - 1; i++) {     // test case 69/97
            if(nums[i] < 0) {
                nums[i] = nums[i] * - 1;
            }
        }

        Arrays.sort(nums);

        int ans = 1;
        for(int i = nums.length - 1; i>=nums.length - 3; i--) {
            ans *= nums[i];
        }
        return ans;
    }

    static int maximumProd(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
