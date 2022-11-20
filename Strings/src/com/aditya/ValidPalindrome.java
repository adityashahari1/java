package com.aditya;

class ValidPalindrome {
    public static void main(String[] args) {
        String s = " sadfadsf";
        System.out.println(isPalindrome(s));

    }

    static boolean isPalindrome(String s) {

        for (int start = 0, end = s.length()-1; start < end;) {
            if (!Character.isLetterOrDigit(s.charAt(start)))
                start++;
            else if (!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            else if (Character.toLowerCase(s.charAt(start++)) != Character.toLowerCase(s.charAt(end--)))
                return false;
        }
        return true;
    }
}

