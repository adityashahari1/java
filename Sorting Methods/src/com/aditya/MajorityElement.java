package com.aditya;

public class MajorityElement {
    public static void main(String[] args) {
        int[]  nums = {2,2,3,3,3,3,2};

        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) { // this exceeds time complexity instead sort the array and return
        int n = nums.length;                 // mid/2 element
        int count = 0;
        for(int i = 0; i<n; i++) {
            count = 0;
            for(int j = 0; j<n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > (n/2)) {
                return nums[i];
            }
        }
        return 1;
    }
}
