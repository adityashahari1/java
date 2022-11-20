package com.adityaJP.constructors;

public class ParameterizedConstructor {
    int id;
    String name;

    ParameterizedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id +" "+ name);
    }
}

class Test2 {
    public static void main(String[] args) {
        ParameterizedConstructor p1 = new ParameterizedConstructor(1, "Aditya");
        ParameterizedConstructor p2 = new ParameterizedConstructor(2, "Ramesh");
        p1.display();
        p2.display();
    }
}
