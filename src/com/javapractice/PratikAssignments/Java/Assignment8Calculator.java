package com.javapractice.PratikAssignments.Java;

public class Assignment8Calculator {
    public int add(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public void printMessage()
    {
        System.out.println("Hello!");
    }

    public static void printDeveloperInfo(String name, int YOE)
    {
        System.out.println("Developer Name: " + name);
        System.out.println("Years of Experience: " + YOE);
    }

    public static void main(String[] args) {
        Assignment8Calculator calculator = new Assignment8Calculator();
        int sum = calculator.add(10, 3);
        int diff = calculator.subtract(10, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);

        calculator.printMessage();

        printDeveloperInfo("John Doe", 5);
    }
}
