package com.javapractice.collections.set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        // Create an Set
        Set<String > fruits = new LinkedHashSet<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");


        for(String fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println("Fruits in the list:"+fruits);



        System.out.println("After adding specific index:"+fruits);



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


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Banana");

        System.out.println("Fruits in the list:"+fruits);

        //toArray
        Object[] fruitArray = fruits.toArray();
        System.out.println("Fruits in the array:");
        for(Object fruit : fruitArray) {
            System.out.println(fruit);
        }

        //retainAll
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Apple");
        anotherSet.add("Banana");
        anotherSet.add("Grapes");
        fruits.retainAll(anotherSet);
        System.out.println("Fruits in the list after retainAll:"+fruits);

        //remove All
        Set<String> removeSet = new HashSet<>();
        removeSet.add("Apple");
        fruits.removeAll(removeSet);
        System.out.println("Fruits in the list after removeAll:"+fruits);





    }
}
