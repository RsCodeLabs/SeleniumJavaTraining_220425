package com.javapractice.collections.lamdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve","Anusha","Alex","Amit");

    Set<String> Anames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toSet());

        System.out.println("Names starting with 'A': " + Anames);




    }
}
