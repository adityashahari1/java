package com.company.aditya.access;

public class A {

    // private only class
    // public everywhere
    // default
    // protected



    public int num;   // only accessible in this class. Use get set for updating and printing -> Encapsulation
    String name;
    int[] arr;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public static void main(String[] args) {
        A obj = new A(3, "Aditya");
        System.out.println(obj.num);
    }
}



















