package com.aditya;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
        System.out.println(lcm(2, 14));
    }

    static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        if(b == 0) {
            return a;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b) {

        return a * b /gcd(a, b);
    }
}
