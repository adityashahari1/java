package com.aditya;

public class ImplementstrStr {
    public static void main(String[] args) {   // revisit
        String haystack = "hello";             // requires kmp algorithm to optimize
        String needle = "ll";
    }

    static int strStr(String haystack, String needle) {
        int h = 0, n = 0;
        while(h < haystack.length() && n < needle.length()) {
            if(haystack.charAt(h) == needle.charAt(n)) {
                h++;
                n++;
            }
            else if(haystack.charAt(h) != needle.charAt(n)) {
                h++;
            }
        }
        return n;
    }
}
