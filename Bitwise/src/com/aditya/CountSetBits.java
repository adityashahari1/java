package com.aditya;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(printBits(n));
    }

    static int printBits(int n) {
        int count = 0;

//        while(n > 0) {
//            count++;
//            n -= (n & -n);
//        }

        while(n > 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }
}
