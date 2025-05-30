package com.javapractice.collections.lamdaAndStreams;

public class LamdaEx2 {
    public static void main(String[] args) {

     Addable addition =  (a,b)->a + b;

     addition.add(10,20);
        System.out.println("Addition: " + addition.add(10, 20));

    }
}
