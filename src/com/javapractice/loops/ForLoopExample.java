package com.javapractice.loops;

public class ForLoopExample {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(++a + a++);

        for (int i = 1; i <= 8; i+=2) {
            System.out.println("Iteration: " + i);
        }
    }
}

//Assignemnt, check condition, execute block if conidtion is true ,increment
