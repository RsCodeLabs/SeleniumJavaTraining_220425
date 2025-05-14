package com.javapractice.oops;

public class ReturnMethodEx {


    public ReturnMethodEx(){

    }
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnMethodEx obj = new ReturnMethodEx();
        int sum = obj.add(4, 5);
        System.out.println("Sum is: " + sum);
    }
}
