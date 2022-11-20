package com.aditya.leetcode;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 34324;

    }

    static int bit(int n) {
        long ans = n;
        int count = 0;
        while(ans > 0) {
            count++;

            ans -= ans & (-ans);

        }

        return count;
    }
}
