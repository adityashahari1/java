package com.aditya;

public class FIndNthBit {
    public static void main(String[] args) {        // wrong ans
        int n = 15;
        int i = 4;
        find(n, i);

    }

    static void find(int n, int i) {        //by using left shift operator

        if((n & (1 << i - 1)) > 0) {
            System.out.println("Set");
        }
        else {
            System.out.println("Not set");
        }

    }

    static void find1(int n, int i) {        //by using right shift operator

        if(((n >> i - 1) & 1) > 0) {
            System.out.println("Set");
        }
        else {
            System.out.println("Not set");
        }

    }
}
