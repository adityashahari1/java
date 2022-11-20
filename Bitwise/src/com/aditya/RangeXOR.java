package com.aditya;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);

        int ans2 = 0;
        //only for check, will give TimeLimitExceed for large numbers
        for(int i = a; i<=b; i++) {
            ans2 ^= i;
        }
    }

    // xor from 0 to a
    static int xor(int n) {
        if(n % 4 == 0) {
            return n;
        }
        if(n % 4 == 1) {
            return 1;
        }
        if(n % 4 == 2) {
            return n + 1;
        }
        return 0;
    }
}
