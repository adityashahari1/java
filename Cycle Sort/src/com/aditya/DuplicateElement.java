package com.aditya;
// asked in amazon
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 2};
        int ans = duplicate(arr);
        System.out.println(ans);
    }

    static int duplicate (int[] nums) {
        int i = 0;

        while(i<nums.length) {
            if(nums[i] != i + 1) {
                int index = nums[i] - 1;
                if(nums[i] != nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
                else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }
}
