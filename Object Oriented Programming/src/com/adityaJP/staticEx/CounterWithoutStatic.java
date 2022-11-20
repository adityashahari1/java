package com.adityaJP.staticEx;

public class CounterWithoutStatic {
    int count = 0;

    CounterWithoutStatic() {
        count ++;
        System.out.println(count);
    }
}

class CWithoutStatic {
    public static void main(String[] args) {
        CounterWithoutStatic c1 = new CounterWithoutStatic();
        CounterWithoutStatic c2 = new CounterWithoutStatic();
        CounterWithoutStatic c3 = new CounterWithoutStatic();
    }
}
// Problem:
// Since instance variable gets the memory at the time of object creation, each object will have the copy
// of the instance variable. If it is incremented, it won't reflect other objects.
