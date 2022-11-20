package com.company.aditya.staticblock;

public class InstanceBlock {

    int c = 10;

    static int a = 4;
    static int b;

    InstanceBlock() {
        System.out.println("Inside constructor");
    }

    {
        System.out.println("Inside instance block");
    }

    public static void main(String[] args) {
        // System.out.println(StaticBlock.a + " " + StaticBlock.b);

        InstanceBlock obj = new InstanceBlock();

        System.out.println(InstanceBlock.a + " " + InstanceBlock.b);
    }
}
