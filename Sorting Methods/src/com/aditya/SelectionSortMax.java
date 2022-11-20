package com.aditya;

import java.util.Arrays;

public class SelectionSortMax {
    public static void main(String[] args) {
        int[] arr = { -2, -6, 0, 66, 7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            int last = arr.length - i - 1;
            int maxValue = getMax(arr, 0, arr.length - i);

            int temp = arr[maxValue];
            arr[maxValue] = arr[last];
            arr[last] = temp;
        }
    }
    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i<end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}

