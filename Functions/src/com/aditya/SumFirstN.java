package com.aditya;
import java.util.Scanner;

public class SumFirstN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        sum(n);
    }
    static void sum (int n) {

        int sum = 0;

        for (int j = 0; j <= n; j++) {
            sum = sum + j;
        }
        System.out.println("Sum: "+sum);
    }
}
