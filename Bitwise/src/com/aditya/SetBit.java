package com.aditya;

public class SetBit {
    public static void main(String[] args) {
        // set means   1 -> 1
        //             0 -> 1
        System.out.println(set(13, 2));
    }

    static int set(int n, int i) {
        return n | (1 << (i - 1));
    }
}
