package com.aditya;

public class Prime {
    public static void main(String[] args) {
        int n = 20;

        for(int i = 2; i<n; i++) {                  // total time complexity O(n*sq(n))
            System.out.println(i + " " + isPrime(i));
        }

    }

    static boolean isPrime(int n) {  // time complexity O(sq(n))

        int c = 2;
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }

        return true;
    }
}
