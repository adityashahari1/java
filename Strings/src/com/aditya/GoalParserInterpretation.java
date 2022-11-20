package com.aditya;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";

        String ans = interpret(command);
        System.out.println(ans);
    }

    static String interpret(String command) {
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<command.length(); i++) { //  no need to run loop till n-1 because the brackets are always in pairs
            if(command.charAt(i) == '(' &&  command.charAt(i+1) == ')') {  // that is, they are always even
                ans.append('o');
                i = i + 1;
            }
            else if(command.charAt(i) == '(' &&  command.charAt(i+1) == 'a') {
                ans.append("al");
                i = i + 3;
            }
            else {
                ans.append('G');
            }
        }

        return ans.toString();
    }
}