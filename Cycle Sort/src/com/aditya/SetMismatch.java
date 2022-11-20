package com.aditya;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] ans = duplicateAndMissing(arr);

        System.out.println(Arrays.toString(ans));
    }

    static int[] duplicateAndMissing (int[] nums) {
        int i = 0;
        while(i<nums.length) {
            int index = nums[i] - 1;

            if(nums[i] != nums[index]) {
                //swap
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else {
                i++;
            }
        }
        for (int j = 0; j <nums.length; j++) {
            if(nums[j] != j + 1) {
                return new int[] {nums[j], j+1};
            }
        }
        return new int[] {-1, -1};
    }
}

