package com.aditya;

import java.util.Arrays;

public class CheckEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "b", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
//    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String str1 = "";
//        String str2 = "";
//
//        for(String s: word1) {
//            str1 += s;
//        }
//
//        char[] c = str1.toCharArray();
//
//        for(String s2: word2) {
//            str2 += s2;
//        }
//
//        char[] c2 = str2.toCharArray();
//
//        for(int i = 0; i<c.length; i++) {
//            if(c.length != c2.length ) {
//                return false;
//            }
//            else if(c[i] != c2[i]) {
//                return false;
//            }
//        }
//        return true;
//    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // two pointers to loop through string array element;
        // two pointers for index
        int arr1 = 0; int arr2 = 0;
        int ind1 = 0; int ind2 = 0;

        while(arr1 < word1.length && arr2 < word2.length) {
            if(word1[arr1].charAt(ind1) != word2[arr2].charAt(ind2)) {
                return false;
            }

            if(ind1 == word1[arr1].length() - 1) {
                ind1 = 0;
                arr1++;
            }
            else {
                ind1++;
            }

            if(ind2 == word2[arr2].length() - 1) {
                ind2 = 0;
                arr2++;
            }
            else {
                ind2++;
            }
        }
        return arr1 == word1.length && arr2 == word2.length; // why not return true?
    }
}
