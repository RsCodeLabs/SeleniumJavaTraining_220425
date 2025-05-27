package com.javapractice.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


//Hash - Unordered - null
//LinkedHash - Ordered - null
//Tree - Sorted - NPE

public class HashMapDemo {
    public static void main(String[] args) {
        //Create hashMap

       // 1 -> Banana
        // 2 -> Apple
        // 3 -> Mango
        // 4 -> Grapes

        Map<Integer,String> map = new HashMap<>();
        //Add elements to the HashMap
        map.put(1,"Banana");
        map.put(2,"Apple");
        map.put(4,"Mango");
        map.put(3,"Grapes");
        map.put(5,"Banana");
        map.put(null,"Apple");


        //Print the HashMap
        System.out.println("HashMap output (no order): " + map);

        //Linked hashmap - Preserve the order of insertion
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        //Add elements to the HashMap
        linkedHashMap.put(1,"Banana");
        linkedHashMap.put(2,"Apple");
        linkedHashMap.put(4,"Mango");
        linkedHashMap.put(3,"Grapes");
        linkedHashMap.put(5,"Banana");
        linkedHashMap.put(null,"Apple");

        //Print the HashMap
        System.out.println("LinkedHashMap output (order preserved): " + linkedHashMap);


        //Tree map - Preserve the order of insertion
        Map<Integer,String> treeMap = new TreeMap<>();
        //Add elements to the HashMap
        treeMap.put(1,"Banana");
        treeMap.put(2,"Apple");
        treeMap.put(4,"Mango");
        treeMap.put(5,"Grapes");
        treeMap.put(3,"Banana");
       // treeMap.put(null,"Apple"); // This will throw NullPointerException -> null > apple...> null Pointrt

        //Print the HashMap
        System.out.println("LinkedHashMap output (order preserved): " + treeMap);



    }
}
