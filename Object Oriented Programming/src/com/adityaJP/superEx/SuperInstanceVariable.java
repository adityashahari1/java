package com.adityaJP.superEx;

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperInstanceVariable {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}
