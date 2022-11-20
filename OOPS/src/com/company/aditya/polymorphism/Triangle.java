package com.company.aditya.polymorphism;

public class Triangle extends Shapes{


    @Override // this is an annotation
    void area() {
        System.out.println("Area is 0.5 * b * h");
    }
}
