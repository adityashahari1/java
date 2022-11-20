package com.adityaJP.constructors;

public class DefaultConstructor {
    int id;
    String name;

    void display() {
        System.out.println(id +" "+ name);
    }
}

class Test {
    public static void main(String[] args) {
        DefaultConstructor d1 = new DefaultConstructor();
        d1.display();
    }
}
