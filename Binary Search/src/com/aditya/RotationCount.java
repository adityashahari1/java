package com.aditya;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int ans = pivot(arr);
        ans = ans + 1;
        System.out.println(ans);
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid] >= arr[start]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
