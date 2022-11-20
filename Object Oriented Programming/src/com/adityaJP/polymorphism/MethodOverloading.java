package com.adityaJP.polymorphism;
//There are three types of method overloading in general but java only supports two.
//1. Method overloading by changing no. of arguments
//2. Method overloading by changing the data type
//3. (not supported) Method overloading by changing return type

class MethodOverloading1 {
    static void add(int a, int b) {
        System.out.println(a + b);
    }
    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

class MethodOverloading2 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add (double a, double b) {
        return a + b;
    }
}

//class MethodOverloading3 {
//    static int add(int a, int b) {
//        return a + b;
//    }
//
//    static double add(int a, int b) {
//        return a + b;
//    }
//}

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading1.add(4, 5);
        MethodOverloading1.add(4, 5 ,1);

        System.out.println(MethodOverloading2.add(2, 3));
        System.out.println(MethodOverloading2.add(2.4, 3));
    }
}
