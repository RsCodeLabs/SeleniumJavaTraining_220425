package com.javapractice.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        for (int i = 0; i < arr.length; i++) {
            if(i==2){
                arr[2]=200;
            }
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
