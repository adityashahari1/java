package com.aditya;

import java.util.Scanner;

public class NoPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();

        isPalindrome(num);

    }
    static void isPalindrome(int n) {
        int rem;
        int original = n;
        int sum = 0;

        while (n>0) {
            rem = n%10;
            n = n/10;
            sum = sum * 10 + rem;
        }
        if(sum == original)
            System.out.println("Palindrome.");
        else
            System.out.println("Not palindrome.");
    }
}
