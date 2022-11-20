package com.aditya;

public class Shadowing {
    static int x = 100;

    public static void main(String[] args) {

        int x = 10;

        System.out.println(x);
        fun(x);
    }

    static void fun(int a){
        System.out.println(a);
        System.out.println(x);
    }

}
