package com.aditya;

import java.util.Arrays;
// not completed because of hash set

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersection(num1, num2)));

    }

    static int[] intersection(int[] nums1, int[] nums2) {
        int[] res = new int[0];
        int n = 0;

        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    res[n++] = nums1[i];
                }
            }
        }
        return res;
    }
}
