package com.aditya;

public class NegativeIn2DArray {
    public static void main(String[] args) {
        int[][] grid = {{ 4, 3, 2, -1},
                        { 3, 2, 1, -1},
                        { 1, 1,-1, -2},
                        {-1,-1,-2, -3}};
        int ans = countNegatives(grid);

        System.out.println(ans);

    }
    static int countNegatives(int[][] grid) {

        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (grid[i][j] < 0) {
                res += m - i;
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}
