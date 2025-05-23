package com.javapractice.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new LinkedHashSet<>();

        // Add elements to the HashSet
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");

        // Print the HashSet
        System.out.println("HashSet output (no order): " + hashSet);

    }
}
