package com.aditya.leetcode;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static long factorial(int N){
        long fact = 1;

        for(int i = N; i>=1; i--) {
            fact *= i;
        }

        return fact;
    }
}
