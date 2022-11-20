package com.company.aditya.accessTest;

import com.company.aditya.access.A;

class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(2, "Aryan");
        System.out.println(obj.num);
        
    }
}
