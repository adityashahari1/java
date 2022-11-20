package com.aditya.leetcode;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 22;
        System.out.println(binaryGap1(n));
    }

    static int binaryGap(int n) {   // when solution starts with 0  wrong output  tc 206/267;

        if(isp(n)) {
            return 0;
        }

        boolean flag = false;
        int last = 0;
        int count = 1;
        int ans = -1;

        while(n>0) {
            last = n & 1;
            if(last == 1) {
                count = 0;
                flag = true;
            }
            if(last == 0) {
                if(flag) {
                    count ++;
                }
            }

            ans = Math.max(count, ans);

            n = n >> 1;
        }

        return ans + 1;
    }

    static boolean isp(int n) {
        if(n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    static int binaryGap1(int n) {
        int[] arr = new int[32];
        int t = 0;

        for (int i = 0; i < 32; ++i)
            if (((n >> i) & 1) != 0)
                arr[t++] = i;

        int ans = 0;
        for (int i = 0; i < t - 1; ++i)
            ans = Math.max(ans, arr[i+1] - arr[i]);

        return ans;
    }
}
