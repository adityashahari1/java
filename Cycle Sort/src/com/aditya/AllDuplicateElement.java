package com.aditya;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 3, 2, 2};

        List<Integer> answer;
        answer = allDuplicate(arr);
        System.out.println(answer);

    }

    static List<Integer> allDuplicate(int[] nums) {
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
                ans.add(nums[j]);
            }
        }

        return ans;
    }
}
