package com.ankitech.hackerrank.src;

import java.util.List;

public class DiagonalDifference {
     public static int calculateDifference(List<List<Integer>> arr) {

        int matrixSize = arr.size();
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < matrixSize; i++) {
            List<Integer> row = arr.get(i);
            for (int j = 0; j < matrixSize; j++) {
                int value = row.get(j);
                if(i == j){
                    leftDiagonal+=value;
                }
                if(i+j == matrixSize-1){
                    rightDiagonal+=value;
                }
            }
        }
        return Math.abs(leftDiagonal - rightDiagonal);
    }
}
