package com.aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 3, 8 , 8, 6};

        List<Integer> answer;
        answer = allMissing(arr);
        System.out.println(answer);

    }

    static List<Integer> allMissing(int[] nums) {
        int i = 0;

        while(i<nums.length) {
            int index = nums[i] - 1;
            if(nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j<nums.length; j++) {
            if(nums[j] != j+1) {
                ans.add(j+1);
            }
        }

        return ans;
    }
}
