package com.javapractice.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {

        //Create a hashmap
        Map<Integer, String> fruits = new HashMap<>();
        //Adding elements to the hashmap

        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Mango");
        fruits.put(4, "Orange");
        fruits.put(5, "Grapes");


        // Displaying the hashmap
        System.out.println("Fruits in the hashmap:" + fruits);

        // Accessing elements using key
        String fruit4 = fruits.get(4); //Orange

        //Remove an Entry By Key
        fruits.remove(2); // Removes the entry with key 2 (Banana)
        System.out.println("Fruits in the hashmap:" + fruits);

        // Check if a key exists
        if (fruits.containsKey(3)) {
            System.out.println("Key 3 exists in the hashmap with value: " + fruits.get(3)); // Mango
        } else {
            System.out.println("Key 3 does not exist in the hashmap.");
        }

        // Check if a key exists
        if (fruits.containsKey(2)) {
            System.out.println("Key 2 exists in the hashmap with value: " + fruits.get(2)); // Mango
        } else {
            System.out.println("Key 2 does not exist in the hashmap.");
        }


        //Check if a value exists
        if (fruits.containsValue("Apple")) {
            System.out.println("Value 'Apple' exists in the hashmap.");
        } else {
            System.out.println("Value 'Apple' does not exist in the hashmap.");
        }

        //Size of the hashmap
        int size = fruits.size();
        System.out.println("Size of the hashmap: " + size); // Output: 4

        //IsEmpty check
        if (fruits.isEmpty()) {
            System.out.println("The hashmap is empty.");
        } else {
            System.out.println("The hashmap is not empty.");
        }

        //Key Set
        System.out.println("Keys in the hashmap: " + fruits.keySet()); // Output: [1, 3, 4, 5]

        //Values
        System.out.println("Values in the hashmap: " + fruits.values()); // Output: [Apple, Mango, Orange, Grapes]

        //Entry Set
        System.out.println("Entries  fruits.entrySet()in the hashmap:");
        System.out.println(fruits.entrySet()); // Output: [1=Apple, 3=Mango, 4=Orange, 5=Grapes]

        //Iterating through the hashmap
        System.out.println("Iterating through the hashmap:");
        for (Map.Entry<Integer, String> entry : fruits.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //Clear the hashmap
        fruits.clear();
        System.out.println("Fruits in the hashmap after clearing: " + fruits); // Output: {}


        Map<Integer, String> studentGrades = new TreeMap<>();
        // Adding student grades
        studentGrades.put( 78, "Charlie");
        studentGrades.put(90,"Bob");
        studentGrades.put(85,"Alice");

        // Displaying student grades
        System.out.println("Student Grades in TreeMap: " + studentGrades);



    }}
