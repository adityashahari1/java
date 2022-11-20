package com.aditya.leetcode;

public class RomanToInteger {
    public static void main(String[] args) {        // test cases remaining
        String s = "IXIVIVIX";
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s) {
        int ans = 0;

        for(int i = s.length() - 1; i>=0; i--) {
            if(s.charAt(i) == 'V') {
                if(i > 0 && s.charAt(i - 1) == 'I') {
                    ans += 4;
                    i -=2;
                }
                else {
                    ans += 5;
                }
            }
            if(s.charAt(i) == 'X') {
                if(i > 0 && s.charAt(i - 1) == 'I') {
                    ans += 9;
                    i -=2;
                }
                else {
                    ans += 10;
                }
            }
            if(s.charAt(i) == 'I') {
                ans += 1;
            }
            if(s.charAt(i) == 'L') {
                ans += 50;
            }
            if(s.charAt(i) == 'C') {
                ans += 100;
            }
            if(s.charAt(i) == 'D') {
                ans += 500;
            }
            if(s.charAt(i) == 'M') {
                ans += 1000;
            }
        }
        return ans;
    }
}
