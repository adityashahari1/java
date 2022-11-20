package com.company.aditya.access;

public class Main {
    public static void main(String[] args) {
        A a = new A(10, "Aditya");
//        a.num;   Error because num is private
//        System.out.println(a.getNum());     // prints 10
//        a.setNum(15);
//        System.out.println(a.getNum());     // prints 15
//
//        A b = new A(5, "Ramesh");
//        System.out.println(b.getNum());

//        System.out.println(a.num);          default allows in the same package

        System.out.println(a.num);
    }
}
