package com.aditya;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target) {       //Incorrect ans cause your are sorting the original array
        int[] ans = new int [2];                        // so the index is changed can use hash maps

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while(true) {
            if(nums[start] + nums[end] == target) {
                ans[0] = start;
                ans[1] = end;
                break;
            }
            else if(nums[start] + nums[end] < target) {
                start++;
            }
            else {
                end--;
            }

        }
        return ans;
    }
}
