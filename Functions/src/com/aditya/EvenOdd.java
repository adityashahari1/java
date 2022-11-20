package com.aditya;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        evenOdd(num);
    }
    static void evenOdd(int a) {
        if (a == 0) {
            System.out.println("Not valid.");
            return;
        }

        if (a%2 == 0)
            System.out.println("Even number.");
        else
            System.out.println("Odd number.");
    }
}
