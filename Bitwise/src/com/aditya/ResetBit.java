package com.aditya;

public class ResetBit {
    public static void main(String[] args) {
        // set means   1 -> 0
        //             0 -> 0
        System.out.println(reset(13, 2));
    }

    static int reset(int n, int i) {

        return n & ~(1 << (i - 1));
    }
}
