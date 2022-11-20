package com.company.aditya;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        method(1, 2, 3, 4, 5, 6);
        multiple(10, 20, "Stringn", "Hello");
    }

    static void method(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...s) {
        System.out.println(Arrays.toString(s));
    }
}
