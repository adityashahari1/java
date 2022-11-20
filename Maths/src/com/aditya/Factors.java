package com.aditya;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        fact4(n);
    }
    //o(n)
    static void fact(int n) {
        for(int i = 1; i<=n; i++) {
            if((n % i) == 0) {
                System.out.print(i + " ");
            }
        }
    }
    // o(sq(n))
    static void fact2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {  // this will print 6 two times for n = 36
            if(n % i == 0) {
                System.out.print(i + " " + n/i +" ");
            }
        }
    }
    // o(sq(n))
    static void fact3(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n/i == i) {
                    System.out.print(i + " ");
                }
                else
                    System.out.print(i + " " + n/i +" ");
            }
        }
    }
    // both time and space will be of sq(n)
    static void fact4(int n) {     // in sorted order
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n/i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
