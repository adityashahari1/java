package com.aditya;



public class ReversePrefixOfWord {

     public static void main(String[] args) {
          String word = "abcdefd";
          char ch = 'd';
          System.out.println(reversePrefix(word, ch));
     }
     static String reversePrefix(String word, char ch) {
          int index = 0;
          for(int i = 0; i<word.length(); i++) {   // find index
               if(ch == word.charAt(i)) {
                    index = i;
                    break;
               }
          }
          if(index == 0){
               return word;
          }

          StringBuilder str = new StringBuilder(word);

          reverse(str, 0, index);

          return str.toString();
     }

     static void reverse(StringBuilder s, int i, int j) {   // reverse string
          while (i < j) {
               char temp = s.charAt(i);
               s.setCharAt(i, s.charAt(j));
               s.setCharAt(j, temp);
               i++;
               j--;
          }
     }


}



