package com.javapractice.Strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("java");
        System.out.println("Before Append"+ name);
        name.append(" is a programming language");
        System.out.println("After Append"+ name);
    }
}
