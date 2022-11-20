package com.adityaJP.staticEx;

public class CounterWithStatic {
    static int count = 0;

    CounterWithStatic() {
        count ++;
        System.out.println(count);
    }
}

class CWithStatic {
    public static void main(String[] args) {
        CounterWithStatic c1 = new CounterWithStatic();
        CounterWithStatic c2 = new CounterWithStatic();
        CounterWithStatic c3 = new CounterWithStatic();
    }
}

// Static variable will get the memory only once.
