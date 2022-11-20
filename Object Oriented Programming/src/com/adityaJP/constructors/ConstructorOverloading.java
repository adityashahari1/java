package com.adityaJP.constructors;

public class ConstructorOverloading {
    int id;
    String name;
    int age;

    ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }
    ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id +" "+ name +" "+ age);
    }
}

class ConsOverload {
    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(1, "Aditya");
        ConstructorOverloading c2 = new ConstructorOverloading(2, "Ramesh", 45);
        c1.display();
        c2.display();
    }
}
