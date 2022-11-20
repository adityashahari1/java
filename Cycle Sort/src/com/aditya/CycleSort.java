package com.aditya;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int index = arr[i] - 1;
            if(arr[i] != arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
            else {
                i++;
            }
        }
    }
}
