package com.company.aditya.accessTest;
import com.company.aditya.access.A;


public class Main {
    public static void main(String[] args) {

        A obj = new A(10, "aditya");
//        System.out.println(obj.num);    if public then accessible
//        System.out.println(obj.num);      if default then not allowed, allowed in the same package different classes
        System.out.println(obj.num);
//        System.out.println(obj.num);
    }
}
