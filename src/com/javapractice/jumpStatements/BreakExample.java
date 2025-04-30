package com.javapractice.jumpStatements;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Terminates the loop when i is 3
            }
            System.out.println("Iteration: " + i);
        }
    }
}


