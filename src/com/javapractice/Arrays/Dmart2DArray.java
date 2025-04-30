package com.javapractice.Arrays;

public class Dmart2DArray {
    public static void main(String[] args) {
        // 2D Array: {Category, Item Name, Price}
        String[][] dmartItems = {
                {"Fruits", "Apple", "120"},
                {"Fruits", "Banana", "40"},
                {"Fruits", "Mango", "150"},
                {"Books", "Java Basics", "300"},
                {"Books", "Data Structures", "500"},
                {"Books", "Cookbook", "250"},
                {"Flowers", "Rose", "20"},
                {"Flowers", "Lily", "30"},
                {"Flowers", "Jasmine", "25"}
        };
        System.out.println("Dmart Inventory:");

        for (int i = 0; i < dmartItems.length; i++) {
            for (int j = 0; j < dmartItems[i].length; j++) {
                System.out.print(dmartItems[i][j] + " ");
            }
            System.out.println(); // Moves to the next line after each row
        }
    }
}

