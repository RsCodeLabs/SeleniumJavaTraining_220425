package com.javapractice.ExceptionHandling;

import java.io.FileInputStream;

public class tryCatchEx {
    public static void main(String[] args) throws InterruptedException {

        int i =3;
        if(i==2){
            System.out.println("i is 2");
        }
       else{
           throw new ArithmeticException("i is not 2");
        }
       Thread.sleep(3000);

        try{
           int a = 10/0;
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Hello");
    }
}
