package com.aditya.leetcode;

public class HappyNumber {
    public static void main(String[] args) {   //ans for false takes infinity
        int n = 19;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n) {
        int sum = 0;

        while(n>0) {
            int last = n % 10;
            n = n / 10;
            sum += last * last;

            if(n == 0 && sum == 1) {
                return true;
            }
            else if(n == 0) {
                n = sum;
                sum = 0;
            }
        }
        return false;
    }
}
