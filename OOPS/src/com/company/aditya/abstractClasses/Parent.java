package com.company.aditya.abstractClasses;

abstract class Parent {

    int age;
    final int VALUE;
    static int sal;


    abstract void career();
    abstract void partner();

    // no abstract constructors
    Parent(int age, int sal) {
        this.age = age;
        Parent.sal = sal;
        VALUE = 34;
    }

}
