package com.aditya;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;

        int[] ans = {-1, -1};
        ans[0] = index1(arr, target);
        ans[1] = index2(arr, target);

        for(int i = 0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    static int index1(int[] arr, int target) {
        int ind1 = -1;
        for(int i = 0; i<arr.length; i++) {
            if(target == arr[i]) {
                ind1 = i;
                break;
            }
        }
        return ind1;
    }
    static int index2(int[] arr, int target) {
        int ind2 = -1;
        for(int i = arr.length-1; i>0; i--) {
            if(target == arr[i]) {
                ind2 = i;
                break;
            }
        }
        return ind2;
    }
}
