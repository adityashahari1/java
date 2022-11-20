package com.company.aditya.singletonClass;


// only one object is allowed to be created
// 1. Make constructor private so its object cannot be created outside file



public class Main {
    public static void main(String[] args) {
        // all 3 reference variables are pointing to one object

        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
    }
}
