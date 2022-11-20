package com.aditya;

public class IsPowerOf2 {
    public static void main(String[] args) {
        int n = 31;

        System.out.println(isPower(n));
        System.out.println(isp(n));

    }
    static boolean isPower(int n) {
        if(n == 0) {
            return false;
        }

        int count = 0;
        while(n > 0) {
            int last = n & 1;
            if(last == 1) count++;
            n = n >> 1;
        }

        return count == 1;
    }

    static boolean isp(int n) {
        if(n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }


}
