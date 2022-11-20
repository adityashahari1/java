package com.aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 0 ,1};
        findDisappearedNumbers(arr);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] ==  nums[correct]) {
                i++;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }

        for(int j = 0; j<nums.length; j++) {
            if(nums[j] != (j+1)) {
                list.add(j+1);
            }
        }
        return list;
    }
}
