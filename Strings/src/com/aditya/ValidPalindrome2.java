package com.aditya;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "";
        System.out.println(validPalindrome(s));
    }

    static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPalinedrome(s, i + 1, j) || isPalinedrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isPalinedrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
