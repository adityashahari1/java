package com.aditya;

public class MergeStringsAlt {
    public static void main(String[] args) {
        String  word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0, j = 0;

        int m = word1.length();
        int n = word2.length();

        while(i < m || j < n) {
            if (i < m)
                str.append(word1.charAt(i++));
            if (j < n)
                str.append(word2.charAt(j++));
        }

        return str.toString();
    }
}
