package com.aditya;

public class EvenOrOdd1 {
    public static void main(String[] args) {
        isOdd(0);
    }

    static void isOdd(int n) {
        if((n & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
