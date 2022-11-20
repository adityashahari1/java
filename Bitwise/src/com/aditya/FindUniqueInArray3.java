package com.aditya;

public class FindUniqueInArray3 {                  //Solve later also in leetcode
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 1, 3, 2, 1, 4, 1, 3, 6, 4};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum % 3;
    }
}
