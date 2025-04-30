package com.javapractice.Strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("java");
        System.out.println("Before Append"+ name);
        name.append(" is a programming language");
        System.out.println("After Append"+ name);

    }

}
