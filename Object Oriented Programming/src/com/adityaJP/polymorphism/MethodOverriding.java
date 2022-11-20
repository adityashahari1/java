package com.adityaJP.polymorphism;

// Here we need to specify run method for Bike specifically
//class Vehicle {
//    void run() {
//        System.out.println("Vehicle is running");
//    }
//}
//
//class Bike extends Vehicle {
//    public static void main(String[] args) {
//        Bike v1 = new Bike();
//        v1.run();
//    }
//}

class Vehicle2 {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike2 extends Vehicle2 {
    //@Override :- Used to verify if method is overridden means is same method present in the super class

    void run() {
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Bike2 v2 = new Bike2();
        v2.run();
    }
}

