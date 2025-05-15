package com.javapractice.Strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("java");
        System.out.println("Before Append"+ name);
        name.append(" is a programming language");
        System.out.println("After Append"+ name);


        //Mulithreading -  provides access to thread at once - only one thread can access at a time
        //StringBuffer is synchronized - thread safe

        //StringBuilder is not synchronized - not thread safe
        //StringBuilder is faster than StringBuffer





    }
}
