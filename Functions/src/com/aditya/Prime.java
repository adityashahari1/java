package com.aditya;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        isPrime(num);
    }
    static void isPrime(int a) {
        int n = 2;
        while((n*n)<a) {

            if((a%n) == 0) {
                System.out.println("Not Prime");
                return;
            }
            n++;
        }
        System.out.println("Prime");
    }
}
