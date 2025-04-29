package com.javapractice.operators;

public class JavaOperators {

    public static void main(String[] args)
    {

        //logical operator
        boolean x = true, y = false;
        System.out.println("Logical and " + (x && y));
        System.out.println("Logical or " + (x || y));
        System.out.println("Logical and " + (!x));
        System.out.println((3>5) && (1/0==0));


        //bitwise operator

        //Assignment operator
        int a = 100, b=20;
        System.out.println("Assignment operator a+=b" + (a+=b));
        System.out.println("Assignment operator a-=b" + (a-=b));
        System.out.println("Assignment operator a.=b" + (a/=b));

        //Unary operater
        int c =5;
        System.out.println("Assignment operator c++ " + (c++));
        System.out.println("Assignment operator c " + (c));
        System.out.println("Assignment operator c-- " + (c--));
        System.out.println("Assignment operator c " + (c));
        System.out.println("Assignment operator ++c " + (++c));
        System.out.println("Assignment operator c " + (c));
        System.out.println("Assignment operator --c " + (--c));
        System.out.println("Assignment operator c " + (c));




    }

}
