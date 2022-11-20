package com.aditya.leetcode;

public class ReverseBits {
    public static void main(String[] args) {     // not printing in bits
        int n = 1111000;
        System.out.println(reverseBits(n));
    }

    static int reverseBits(int n) {

        int result = 0;
        int bit = 0;

        for(int i = 0; i<32; i++) {
            bit = (n >> i) & 1;
            result = result | (bit <<(31 - i));
        }
        return result;
    }
}
