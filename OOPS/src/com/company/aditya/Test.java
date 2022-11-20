package com.company.aditya;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int input = 13;

        System.out.println(calculateWeight(input));
    }

    static int calculateWeight(int month) {
        if(month > 12 || month < 0) {
            return 0;
        }

        if (month == 0) {
            return 1;
        }

        int prev = (month - 1) + ((month - 1)  * (month - 1) * (month - 1));
        int ans = prev + month * month * month;
        return ans;
    }

}
