package com.aditya;

public class SubstringsInAWord {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};

        String word = "abc";
        int ans = numOfStrings(patterns, word);
        System.out.println(ans);

    }

    static int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for(String s : patterns) {
            if(word.contains(s)) {
                res++;
            }
        }
        return res;
    }
}
