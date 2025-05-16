package com.javapractice.PratikAssignments.Java;

class Printer
{
    public void print(String str)
    {
        System.out.println("String: " + str);
    }

    public void print(int num)
    {
        System.out.println("Integer: " + num);
    }
}

public class Assignment15_1MethodOverloadingEx {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello!");
        printer.print(10);
    }
}
