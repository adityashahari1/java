package com.company.aditya;

public class Shadowing {
    static int x = 10;

    public static void main(String[] args) {

        System.out.println(x);
        int x = 50;     // print without int and with int to see the difference
        System.out.println(x);
        print();
        System.out.println(x);

    }

    static void print() {
        System.out.println(x);
    }
}
