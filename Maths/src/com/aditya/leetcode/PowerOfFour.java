package com.aditya.leetcode;

public class PowerOfFour {
    public static void main(String[] args) {

    }

    static boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;

        for(int i = 0; i<32; i+=2) {
            if((n ^ (1 << i)) == 0)
                return true;
        }

        return false;
    }

    static boolean isPowerOfFour1(int n) {
        while(n > 0 && n % 4 == 0){
            n /= 4;
        }
        return n == 1;
    }

    static boolean isPowerOfFour2(int n) {
        if (n == 1) {
            return true;
        }
        if (n<1) {
            return false;
        }

        return ((Math.log(n)/Math.log(4)) % 1 == 0);
    }
}
