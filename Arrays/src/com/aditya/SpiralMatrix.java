package com.aditya;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
        };

        spiralOrder(matrix);

    }

    static void spiralOrder(int[][] matrix) {
        ArrayList <Integer> list = new ArrayList<>();

        if (matrix.length == 0) {
            return;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            for(int i = colBegin; i <= colEnd; i++) {
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i = rowBegin; i<= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for(int i = colEnd; i >= colBegin; i--) {
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                for(int i = rowEnd; i>= rowBegin; i--) {
                    list.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
