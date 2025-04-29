package com.javapractice.loops;

public class LoopProblem {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int sum = 0;
        for(int i=0; i<=arr.length-1;i++)
        {
            sum = arr[i]+sum;
        }
        System.out.println("Average of the Array: "+ sum/arr.length);


        String str = "Welcome to Java";
        System.out.println("Length of the String: "+str.length());

    }
}
