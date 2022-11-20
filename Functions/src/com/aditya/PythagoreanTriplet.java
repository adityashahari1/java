package com.aditya;

import java.util.Scanner;
import java.lang.Math;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = in.nextInt();
        int  b = in.nextInt();
        int c = in.nextInt();

        isTriplet(a, b, c);
    }
    static void isTriplet(int a, int b, int c) {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("Pythagorean Triplet");
        }
        else if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
            System.out.println("Pythagorean Triplet");
        }
        else if (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
            System.out.println("Pythagorean Triplet");
        }
        else
            System.out.println("Not a Pythagorean Triplet");
    }
}
