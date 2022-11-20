package com.adityaJP.inheritance;

class Animal1 {
    void eat() {
        System.out.println("eating");
    }
}

class Dog1 extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

class BabyDog extends Dog1 {
    void weeping() {
        System.out.println("weeping");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();
        b.eat();
        b.bark();
        b.weeping();
    }
}
