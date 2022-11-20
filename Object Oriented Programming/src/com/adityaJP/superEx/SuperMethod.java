package com.adityaJP.superEx;

class Species {
    void property() {
        System.out.println("Species is walking");
    }
}

class Cat extends Species {
    void property() {
        System.out.println("Cat is walking");
    }

    void display() {
        property();
        super.property();
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.display();
    }
}
