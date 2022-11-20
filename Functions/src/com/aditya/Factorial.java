package com.aditya;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        factorial(n);

    }
    static void factorial(int n){
        if (n == 0 || n == 1) {
            System.out.println("Answer: 1");
            return;
        }
        int fact = 1;
        int ans = 1;

        while (fact<=n) {
            ans *=  fact;
            fact ++;
        }
        System.out.println("Answer: "+ans);
    }
}
/*
0 || 1 -> 1
* 4 -> 1* 2* 3* 4 -> 24
*
* */