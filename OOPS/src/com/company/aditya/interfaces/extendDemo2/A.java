package com.company.aditya.interfaces.extendDemo2;

public interface A {
    void fun();

    default void gun() {
        System.out.println("I am inside A");
    }
}
