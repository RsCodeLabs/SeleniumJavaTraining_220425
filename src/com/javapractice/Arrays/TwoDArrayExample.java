package com.javapractice.Arrays;

public class TwoDArrayExample {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Element at row 1, column 2: " + matrix[1][2]);//Row 1 → {4, 5, 6}
                                                                            //Column 2 in row 1 → 6

        System.out.println("Element at row 1, column 1: " + matrix[1][1]);
    }
}
