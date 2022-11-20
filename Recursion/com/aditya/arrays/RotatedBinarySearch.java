package com.aditya.arrays;

public class RotatedBinarySearch {
    public RotatedBinarySearch() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 1, 2, 3};
        int ans = search(arr, 3, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        } else {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[s] <= arr[mid]) {
                return target >= arr[s] && target <= arr[mid] ? search(arr, target, s, mid - 1) : search(arr, target, mid + 1, e);
            } else {
                return target >= arr[mid] && target <= arr[e] ? search(arr, target, mid + 1, e) : search(arr, target, s, mid - 1);
            }
        }
    }
}
