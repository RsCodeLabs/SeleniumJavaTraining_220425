package com.javapractice.Arrays;

public class DmartMultipleCategories {
    public static void main(String[] args) {
        // Fruits category
        String[] fruits = {"Apple", "Banana", "Mango"};
        // Books category
        String[] books = {"Java Basics", "Data Structures", "Cookbook"};
        // Flowers category
        String[] flowers = {"Rose", "Lily", "Jasmine"};
        System.out.println("Fruits Section:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        System.out.println("\nBooks Section:");
        for (String book : books) {
            System.out.println("- " + book);
        }
        System.out.println("\nFlowers Section:");
        for (String flower : flowers) {
            System.out.println("- " + flower);
        }
    }
}

