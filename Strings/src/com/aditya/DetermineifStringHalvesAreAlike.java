package com.aditya;

public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";

    }

    static boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        int mid = s.length()/2;

        for(int i = 0; i<mid; i++) {
            if(isVowel(s.charAt(i))) {
                count1++;
            }
        }
        for(int i = mid; i<s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                count2++;
            }
        }

        return count1 == 0 && count2 == 0;
    }
    static boolean isVowel (char c) {
        return  c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
