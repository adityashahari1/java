package com.aditya;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 16, 25, 3, 2, 1};
        int ans = max(arr);
        System.out.println(ans);

    }
    static int max(int[] arr) {


        int start = 0;
        int end = arr.length - 1;
        while(start < end) {

            int mid = (start + end)/2;

            if(arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
            else {
                end = mid; // also can be mid - 1??
            }

        }
        return start;
    }
}
