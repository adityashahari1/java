package com.aditya.leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(5));
    }

    static int climbStairs(int n) {
        int first = 0;
        int second = 1;
        int fib = 0;

        for(int i = 0; i<n; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }

        return fib;
    }
}
