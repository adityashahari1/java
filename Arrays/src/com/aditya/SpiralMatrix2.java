package com.aditya;

import java.util.ArrayList;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        generateMatrix(3);

    }

    static void generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int count = 1;

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            for(int i = colBegin; i <= colEnd; i++, count++) {
                matrix[rowBegin][i] = count;
            }

            rowBegin++;

            for(int i = rowBegin; i<= rowEnd; i++, count++) {
                matrix[i][colEnd] = count;
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for(int i = colEnd; i >= colBegin; i--, count++) {
                    matrix[rowEnd][i] = count;
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                for(int i = rowEnd; i>= rowBegin; i--, count++) {
                    matrix[i][colBegin] = count;
                }
            }
            colBegin++;
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
