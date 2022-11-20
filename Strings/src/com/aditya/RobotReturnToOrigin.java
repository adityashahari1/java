package com.aditya;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }

    static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        char[] ch = moves.toCharArray();

        for(int i = 0; i<ch.length; i++) {
            if(ch[i] == 'L') {
                x = x - 1;
            }
            else if(ch[i] == 'R') {
                x = x + 1;
            }

            else if(ch[i] == 'U') {
                y = y + 1;
            }
            else
                y = y - 1;
        }
        return x == 0 && y == 0;
    }
}
