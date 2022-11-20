package com.aditya.leetcode;

public class BinaryNumberAlternatingBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(hasAlternatingBits(n));
    }

    static boolean hasAlternatingBits(int n) {
        int curr = n & 1;
        n = n >> 1;

        while(n>0) {
            if(curr == (n & 1))
                return false;

            curr = n & 1;
            n = n >> 1;
        }

        return true;
    }
}
