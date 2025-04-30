package com.javapractice.jumpStatements;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i %2== 0) {
                continue; // Skips iteration when i is 3
            }
            System.out.println("Iteration: " + i);
        }
    }




}
