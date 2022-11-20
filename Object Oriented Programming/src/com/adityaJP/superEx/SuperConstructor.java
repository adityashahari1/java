package com.adityaJP.superEx;

import java.util.ArrayList;

class Human {
    Human() {
        System.out.println("Human is created");
    }
}

class Aditya extends Human {
    Aditya() {
        super();        // it is automatically invoked no need to specify
        System.out.println("Aditya is created");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Aditya aditya = new Aditya();
        ArrayList list = new ArrayList();
    }
}