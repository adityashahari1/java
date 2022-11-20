package com.aditya.leetcode;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 2;

        count(n);

    }

    static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for(int i = 0; i<=n; i++) {
            ans[i] = count(i);
        }
        return ans;
    }

    static int count(int n) {
        int index = 0;
        while(n > 0) {
            index++;
            n -= n & (-n);
        }
        return index;
    }
}
