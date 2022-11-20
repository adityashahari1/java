package com.aditya;

public class FindInPeakMountain {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 77, 4, 2};
        int target = 3;
        int first = searchLeft(arr, target);

        if (first == -1) {
            first = searchRight(arr, target);
        }
        System.out.println(first);
    }

    static int searchLeft(int[] arr, int target) {
        int start = 0;
        int end = maxIndex(arr);

        while(start <= end) {
            int mid = (start + end)/2;

            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }

    static int searchRight(int[] arr, int target) {
        int start = maxIndex(arr);
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(target < arr[mid]) {
                start = mid + 1;
            }
            else if(target > arr[mid]) {
                end = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }

    static int maxIndex(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start<end) {
            int mid = (start + end)/2;
            if(arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else
                start = mid+1;
        }
        return start;
    }
}
