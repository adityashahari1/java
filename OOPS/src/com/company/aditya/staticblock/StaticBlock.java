package com.company.aditya.staticblock;

public class StaticBlock {

    int c = 10;

    static int a = 4;
    static int b;

    StaticBlock() {
        System.out.println("Inside constructor");
    }

    {
        System.out.println("Inside instance block");
    }

    static {
        System.out.println("I'm inside static block");
        b = a * 4;
    }

    static {
        System.out.println("Hi, my name is Aditya");
    }
    public static void main(String[] args) {
        // System.out.println(StaticBlock.a + " " + StaticBlock.b);

        //StaticBlock obj = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}
