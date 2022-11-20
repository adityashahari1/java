package com.company.aditya.singletonClass;

public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check only one obj is created or not
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
