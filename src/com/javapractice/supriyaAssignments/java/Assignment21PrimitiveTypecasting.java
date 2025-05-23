package com.javapractice.supriyaAssignments.java;

import org.openqa.selenium.devtools.v134.page.model.FrameScheduledNavigation;

import java.util.Scanner;

public class Assignment21PrimitiveTypecasting {
    public static void main(String[] args) {
        System.out.println("Enter a Double no :");
        Scanner scanner = new Scanner(System.in);
        double UserNumber = scanner.nextDouble();
        System.out.println("User entered original number:" + UserNumber);
        //implicit widening
        double doubleNumber = UserNumber;
        System.out.println("Double number:" + doubleNumber);
        // explicit narrowing down to int
        int IntNumber = (int)doubleNumber;
        System.out.println("Int number:" + IntNumber);
        // explicit narrowing down to byte
        byte ByteNumber = (byte)IntNumber;
        System.out.println("Byte number:" + ByteNumber);
        System.out.println("\nPrecision loss( Double to Int ):" + (doubleNumber-IntNumber));
        System.out.println("Precision loss( Int to Byte ):" + (IntNumber-ByteNumber));
        scanner.close();
    }
}
