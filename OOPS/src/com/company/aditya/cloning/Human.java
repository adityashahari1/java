package com.company.aditya.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 7};
    }

//    public Human(Human other) {             // clone solves this problem of writing lengthy code
//        this.age = other.age;
//        this.name = other.name;
//    }


//    public Object clone() throws CloneNotSupportedException {   // shallow copy
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone();     // this is shallow copy

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
