package com.aditya;

public class FirstAndLastOptimized {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = {-1, -1};

        ans[0] = index(nums, target, true);
        ans[1] = index(nums, target, false);

        for (int an : ans) {
            System.out.println(an);
        }

    }
    static int index(int[] nums, int target, boolean startIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start<=end) {
            int mid = (start + end)/2;

            if(target > nums[mid]) {
                start  = mid + 1;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                ans = mid;
                if(startIndex) {
                    end = mid - 1;
                }
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
