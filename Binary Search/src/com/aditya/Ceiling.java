package com.aditya;

public class Ceiling {
    public static void main(String[] args) {
        int[] arry = {2, 4, 5, 8, 12, 34, 45, 66, 76, 77};
        int target = 78;

        int ans = ceiling(arry, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arry, int target) {
        int start = 0;
        int end = arry.length - 1;
        if(target > arry[arry.length-1]) {
            return -1;
        }

        while(start<=end) {
            int mid = start + (end - start)/2;
            if(target > arry[mid]) {
                start = mid + 1;
            }
            else if(target < arry[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
