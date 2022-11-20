package com.company.aditya.staticvsinstance;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.greeting();
    }

    String name;

    static void fun() {
        System.out.println("im inside static method");


    }

    void greeting() {
        System.out.println("Hello there ");
        this.name = "helo";
    }
}
