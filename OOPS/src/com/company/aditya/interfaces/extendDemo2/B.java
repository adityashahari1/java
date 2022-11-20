package com.company.aditya.interfaces.extendDemo2;

public interface B extends A {
    void greet();


    //static method should always have body


    static void greeting() {
        System.out.println("Inside static method");
    }
}
