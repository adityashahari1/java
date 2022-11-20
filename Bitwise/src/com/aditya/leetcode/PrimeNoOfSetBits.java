package com.aditya.leetcode;

public class PrimeNoOfSetBits {
    public static void main(String[] args) {
        int left = 6, right = 10;
        System.out.println(countPrimeSetBits(left, right));
    }

    static int countPrimeSetBits(int left, int right) {    // TLE
        int ans = 0;

        for(int i = left; i<=right; i++) {
            int temp = 0;
            temp = countSetBits(i);
            if(isPrime(temp)) {
                ans ++;
            }
        }

        return ans;
    }

    static int countSetBits(int n) {
        int count = 0;
        while(n>0) {
            count++;
            n -= n & (n-1);
        }
        return count;
    }

    static boolean isPrime(int n) {
        int c = 2;

        while(c * c < n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static int countPrimeSetBits1(int left, int right) {
        int count = 0;
        boolean[] notPrime = new boolean[33];
        notPrime[0] = true; notPrime[1] = true;
        sieve(notPrime);

        for(int i = left; i <= right; i ++) {
            int num = i, setBits = 0;
            while(num > 0) {
                num = num & (num - 1);
                setBits ++;
            }
            if (!notPrime[setBits]) {
                count ++;
            }
        }
        return count;
    }

    static void sieve(boolean[] notPrime) {
        for(int i = 2; i <= 32; i ++) {
            if(!notPrime[i]) {
                for(int j = 2 * i; j <= 32; j += i) {
                    notPrime[j] = true;
                }
            }
        }
    }
}
