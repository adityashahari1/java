package com.aditya;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        int num1, num2, num3;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        Max(num1, num2, num3);
        Min(num1, num2, num3);
    }
    static void Max(int a,int b,int c){
        int max = 0;
        if (a>max)
            max = a;

        if (b>max)
            max = b;

        if (c>max)
            max = c;

        System.out.println("Maximum number: "+max);

    }

    static void Min(int a,int b,int c) {
        if (a < b)
            if (a < c)
                System.out.println("Minimum number: " + a);
            else
                System.out.println("Minimum number: " + c);
        if (b < a)
            if (b < c)
                System.out.println("Minimum number: " + b);
            else
                System.out.println("Minimum number: " + c);

    }
}
