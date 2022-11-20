package com.aditya;

public class WrapperExamples {
    public static void main(String[] args) {

        final A aditya = new A("aditya shahari");
        // when a non primitive is final, you cannot reassign it;
        aditya.name = "other name";   // this allowed
        //aditya = new A("new object");    this is not allowed
    }
}

class A {
    String name;

    A (String name) {
        this.name = name;
    }

    final int num = 10;
}