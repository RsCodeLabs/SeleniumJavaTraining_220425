package com.javapractice.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
        set.add(null);
        set.add(null);

        // Print the HashSet
        System.out.println("HashSet output (no order): " + set);

        // Create a Linked HashSet
        Set<String> set2 = new LinkedHashSet<>();

        // Add elements to the HashSet
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Mango");
        set2.add("Grapes");
        set2.add(null);
        set2.add(null);

        // Print the HashSet
        System.out.println("Linked Hashset output (order prreserved): " + set2);

        // Create a TreeSet
        Set<String> set3 = new TreeSet<>();

        // Add elements to the TreeSet
        set3.add("Banana");
        set3.add("Apple");
        set3.add("Mango");
        set3.add("Grapes");
       //set3.add(null); // This will throw NullPointerException -> null > apple...> null Pointrt

        // Print the HashSet
        System.out.println("Tree output (order prreserved): " + set3);



    }
}
