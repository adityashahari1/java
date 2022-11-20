package com.aditya.leetcode;

public class XorOperationArray {
    public static void main(String[] args) {
        int n = 4, start = 3;
        System.out.println(xorOperation(n, start));
    }

    static int xorOperation(int n, int start) {

        int[] arr = new int[n];

        arr[0] = start;
        for(int i = 1; i<n; i++) {
            arr[i] = start + 2 * i;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    static int xorOperation1(int n, int start) {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans^=start+(2*i);
        }
        return ans;
    }
}
