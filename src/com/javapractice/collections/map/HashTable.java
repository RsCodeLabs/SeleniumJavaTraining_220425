package com.javapractice.collections.map;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        // Adding key-value pairs to the hashtable
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        hashtable.put(4, null); // Note: Hashtable does not allow null values, this will throw NullPointerException

        // Displaying the hashtable
        System.out.println("Hashtable: " + hashtable);

        // Accessing a value by key
        String value = hashtable.get(2);
        System.out.println("Value for key 2: " + value);

        // Checking if a key exists
        boolean containsKey = hashtable.containsKey(3);

        System.out.println("Contains key 3: " + containsKey);
        // Checking if a value exists
        boolean containsValue = hashtable.containsValue("Date");
        System.out.println("Contains value 'Date': " + containsValue);

        // Removing an entry by key
        hashtable.remove(3);
        System.out.println("After removal of key 3: " + hashtable);
        // Size of the hashtable
        int size = hashtable.size();

        System.out.println("Size of the hashtable: " + size);

        // Checking if the hashtable is empty
        boolean isEmpty = hashtable.isEmpty();
        System.out.println("Is the hashtable empty? " + isEmpty);

        // Clearing the hashtable
        hashtable.clear();
        System.out.println("After clearing, hashtable: " + hashtable);

    }
}

