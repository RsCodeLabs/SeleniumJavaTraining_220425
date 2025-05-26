package com.javapractice.collections.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        // Adding elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(10, "Ten");
        treeMap.put(23, "Twenty Three");
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");

        // Displaying the TreeMap
        System.out.println("TreeMap: " + treeMap);


        System.out.println("First Key"+treeMap.firstKey());
        System.out.println("Last Key"+treeMap.lastKey());
        System.out.println("After first & last key: " + treeMap);
        System.out.println("Poll First"+ treeMap.pollFirstEntry());
        System.out.println("After Poll First: " + treeMap);
        System.out.println("Poll Last"+ treeMap.pollLastEntry());
        System.out.println("After Poll Last: " + treeMap);

        treeMap.put(1, "One");
        treeMap.put(23, "Twenty Three");

        //Higher and Lower
        System.out.println("Higher than 5: " + treeMap.higherKey(5));  //>
        System.out.println("Lower than 5: " + treeMap.lowerKey(5));  //<

        //Celling and Flooring
        System.out.println("Ceiling of 5: " + treeMap.ceilingKey(5));  //>=
        System.out.println("Floor of 5: " + treeMap.floorKey(5));  // <=

        System.out.println("TreeMap: " + treeMap);

        // SubMap
        System.out.println("SubMap from 1 to 10: " + treeMap.subMap(1,  10));

        // HeadMap
        System.out.println("HeadMap up to 5: " + treeMap.headMap(5)); // Returns all keys less than 5

        // TailMap
        System.out.println("TailMap from 5: " + treeMap.tailMap(5)); // Returns all keys greater than or equal to 5

        // NavigableMap methods
        System.out.println("Descending Map: " + treeMap.descendingMap()); // Returns a view of the map in reverse order





    }
}
