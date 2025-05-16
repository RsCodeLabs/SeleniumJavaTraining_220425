package com.javapractice.PratikAssignments.Java;

/*
🔰 Sample Output:
Static Method without params called
Static Method with params: Sum is 30
Non-Static Method without params called
Non-Static Method with params: Hello, John!
*/

public class Assignment7UserDefinedMethodsEx {
    public static void printMsg()
    {
        System.out.println("Hello!");
    }

    public static String printName(String name)
    {
        return name;
    }

    public void printMsg1()
    {
        System.out.println("Welcome!");
    }

    public String printName1(String name)
    {
        return name;
    }


    public static void main(String[] args) {
        Assignment7UserDefinedMethodsEx obj = new Assignment7UserDefinedMethodsEx();
        printMsg();
        System.out.println(printName("Selenium"));
        obj.printMsg1();
        System.out.println(obj.printName1("Java"));
    }
}
