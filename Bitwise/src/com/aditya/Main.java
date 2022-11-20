package com.aditya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        sumZero(1);

    }

    static void sumZero(int n) {

        int[] result = new int[n];
        int j = 0;

        for (int i = 1; i <= n/2; i++) {
            result[j] = i;
            result[j + 1] = -i;
            j = j + 2;
        }

        System.out.println(Arrays.toString(result));

    }
}
