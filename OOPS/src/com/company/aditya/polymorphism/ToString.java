package com.company.aditya.polymorphism;

public class ToString {
    int num;

    ToString(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ToString obj = new ToString(45);
        System.out.println(obj);
    }
}
