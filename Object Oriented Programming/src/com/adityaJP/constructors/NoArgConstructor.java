package com.adityaJP.constructors;

public class NoArgConstructor {
    int id;
    String name;

    NoArgConstructor() {
        System.out.println(id +" "+ name);
    }
}

class Test1 {
    public static void main(String[] args) {
        NoArgConstructor n1 = new NoArgConstructor();
    }
}