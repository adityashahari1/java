package com.company.aditya.interfaces.extendDemo2;

public class Nested {
    interface Demo {
        void greet();
    }
}

class C implements Nested.Demo {

    @Override
    public void greet() {

    }
}
