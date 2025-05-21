package com.javapractice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> fruits = new ArrayList<>();
        // Parent p = new Child();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println(fruits);

        // Create an iterator
        Iterator<String> iterator = fruits.iterator();

        // Iterate through the ArrayList using the iterator
        while(iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
            if(fruit.equals("Banana")){
                iterator.remove(); // Remove the current element
            }

        }
        System.out.println(fruits);


    }
}
