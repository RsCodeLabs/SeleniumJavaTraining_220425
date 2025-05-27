package com.javapractice.supriyaAssignments.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment22ExceptionHandling {
    public static void main(String[] args) throws InputMismatchException {
        try{
            System.out.println("Enter an Integer Number:");
            Scanner scanner = new Scanner(System.in);
            int OriginalUserEntry = scanner.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("\nException is caught    " + e.getClass().getSimpleName() );
        }
        finally
        {
            System.out.println( "Done processing input.");
        }

        }
}

