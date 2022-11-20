package com.aditya.leetcode;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrongNumber(n));
    }

    static boolean armstrongNumber(int n) {
        int temp = n;
        int sum = 0;
        int last;

        while(n>0) {
            last = n % 10;
            sum += last*last*last;
            n = n/10;
        }

        return sum == temp;
    }
}
