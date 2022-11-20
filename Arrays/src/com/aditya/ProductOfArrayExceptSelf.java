package com.aditya;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        productExceptSelf(nums);
    }

    static void productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
        int zero = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                zero++;
            else
                product *= nums[i];
        }

        for(int i = 0; i<answer.length; i++) {
            if(zero > 1)
                answer[i] = 0;

            else if (zero == 0)
                answer[i] = product / nums[i];

            else if(zero == 1 && nums[i] != 0)
                answer[i] = 0;

            else
                answer[i] = product;
        }


        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
    static void productExceptSelf1(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
    }
}
