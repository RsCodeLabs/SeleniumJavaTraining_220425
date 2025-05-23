package com.javapractice.collections.list;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String > fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");


        for(String fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println("Fruits in the list:"+fruits);

        //adding/inserting element at specific index
        fruits.add(2, "Mango");

        System.out.println("After adding specific index:"+fruits);

        // Get an element from the ArrayList
        String fruitAtIndex4 = fruits.get(4);
        System.out.println("Fruit at index 4: " + fruitAtIndex4);

        //Update an element in the ArrayList
        fruits.set(1, "Blueberry");
        System.out.println("Fruit at index 4: " + fruits.get(1));
        System.out.println("Fruits in the list:"+fruits);

        // Remove an element from the ArrayList
        fruits.remove("Cherry");
        System.out.println("Fruits in the list:"+fruits);
        fruits.remove(1);
        System.out.println("Fruits in the list:"+fruits);

        //Contains
        boolean containsBlueBerry = fruits.contains("Blueberry");
        System.out.println("Contains Blueberry: " + containsBlueBerry);


        //size()
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        //clear
        fruits.clear();
        System.out.println("Fruits in the list:"+fruits);

        //isEmpty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        //indexOf
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Banana");



        int indexOfBanana = fruits.indexOf("Banana");
        System.out.println("Index of Banana: " + indexOfBanana);

        //Last index
        int lastIndexOfBanana = fruits.lastIndexOf("Banana");
        System.out.println("Last index of Banana: " + lastIndexOfBanana);



    }
}
