package com.company.aditya;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if(n  == 0 || n == 1)
            return false;

        int c = 2;
        while(c < n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
