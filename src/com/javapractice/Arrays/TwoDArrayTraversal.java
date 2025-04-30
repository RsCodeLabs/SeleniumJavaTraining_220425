package com.javapractice.Arrays;

public class TwoDArrayTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6,4},
                {7, 8, 9,10,45}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Moves to the next line after each row
        }
    }
}
