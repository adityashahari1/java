package com.aditya;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;

        for(int i = 0; i<arr.length; i++) {
            swapped = false;
            for(int j = 0; j<arr.length - i - 1; j++) {     // or you can start with 1 and compare
                if(arr[j] > arr[j+1]) {                     //  arr[j] < arr[j-1];
                    int temp = arr[j+1];                    // 2nd loop will run till arr.length - i;
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
