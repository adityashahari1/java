package com.aditya;

public class FindRightMostSetBit {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(rigthMost(n));
    }

    static int rigthMost(int n) {

        return (int) (Math.log10(n & (-n))/Math.log10(2)) + 1;
    }
}
