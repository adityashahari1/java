package com.aditya;

import java.util.Arrays;

public class ThirdMaximumNumber {    // wrong answer
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }


    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 3) {
            return nums[nums.length-1];
        }
        int count = 1;
        for(int i = 0; i<nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                i++;
            }
            else if(count == 3) {
                return nums[i+1];
            }
            else{
                count++;
            }
        }
        return -1;
    }
}
