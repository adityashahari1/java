package com.aditya;

public class FindNoOfDigitsInBase {
    public static void main(String[] args) {
        int n = 6;
        int base = 2;
        System.out.println(findDigits(n, base));
    }

    static int findDigits(int n, int base) {
        return (int)(Math.log(n) / Math.log(base)) + 1;
    }
}
