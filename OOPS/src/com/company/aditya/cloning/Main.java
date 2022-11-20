package com.company.aditya.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aditya = new Human(21, "aditya");
//        Human twin = new Human(aditya);

        Human twin = (Human)aditya.clone();

        System.out.println(twin.age + " " + twin.name);

        //shallow
//        System.out.println(Arrays.toString(twin.arr));
//        twin.arr[0] = 100;
//        System.out.println(Arrays.toString(aditya.arr));

        //deep
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(aditya.arr));
    }
}
