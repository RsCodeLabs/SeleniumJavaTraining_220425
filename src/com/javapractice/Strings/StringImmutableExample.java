package com.javapractice.Strings;

public class StringImmutableExample {
    public static void main(String[] args) {
        // 1️⃣ Immutable String Example
        String str = "Hello";
        str.concat(" World"); // This does NOT change str, it creates a new object
        System.out.println("String after concat: " + str); // Still "Hello"

        // Proper way to update a String
        str = str.concat(" World");
        System.out.println("Updated String: " + str); // "Hello World"

        // 2️⃣ Mutable StringBuffer Example
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the same object
        System.out.println("StringBuffer after append: " + sb); // "Hello World"

        // 3️⃣ Mutable StringBuilder Example
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World"); // Modifies the same object
        System.out.println("StringBuilder after append: " + sbuilder); // "Hello World"

        // 4️⃣ Memory Comparison (Reference Check)
        String s1 = "Java";
        String s2 = "Java"; // Points to the same object in the string pool
        System.out.println("s1 == s2: " + (s1 == s2)); // true (same reference)

        String s3 = new String("Java");
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different objects)

        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("Java");
        System.out.println("sb1 == sb2: " + (sb1 == sb2)); // false (different objects)

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Java");
        System.out.println("sb3 == sb4: " + (sb3 == sb4)); // false (different objects)
    }
}

