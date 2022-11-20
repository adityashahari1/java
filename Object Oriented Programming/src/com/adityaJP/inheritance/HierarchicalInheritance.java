package com.adityaJP.inheritance;

class Animal2{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog2 extends Animal2{
    void bark(){
        System.out.println("barking...");
    }
}

class Cat2 extends Animal2{
    void meow(){
        System.out.println("meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat2 c1 = new Cat2();
        c1.eat();
        c1.meow();
    }
}
