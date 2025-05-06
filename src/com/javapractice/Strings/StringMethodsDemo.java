package com.javapractice.Strings;

public class StringMethodsDemo {
    public static void main(String[] args) {
        // 1. Length & Character Retrieval
        String str = "Hello World";
//        //length():Returns the number of characters in the string
//        System.out.println("Length: " + str.length());
//        //charAt(int index):Retrieves the character at the specified position
//        System.out.println("Character at index 1: " + str.charAt(1));
//
//        // 2. Case Conversion
//        System.out.println("Uppercase: " + str.toUpperCase());
//        System.out.println("Lowercase: " + str.toLowerCase());

        // 3. Substring Extraction

//        //substring(beginIndex): Extracts a substring from the given index.
//        System.out.println("Substring from index 2: " + str.substring(2));
//        //substring(beginIndex, endIndex): Extracts a substring between given indices.
//        System.out.println("Substring from index 2 to 7: " + str.substring(2, 7));1

        // 4. Comparison Methods
        System.out.println("Equals 'Hello World': " + str.equals("Hello World"));
        System.out.println("Equals 'Hello World': " + str.equals("hello world"));
        System.out.println("Equals Ignore Case 'hello world': " + str.equalsIgnoreCase("hello world"));

        // 5. Search Methods
//        System.out.println("Contains 'World': " + str.contains("World"));
//        System.out.println("Starts with 'He': " + str.startsWith("He"));
//        System.out.println("Ends with 'ld': " + str.endsWith("ld"));
//        System.out.println("Index of 'l': " + str.indexOf('l'));
//        System.out.println("Last index of 'l': " + str.lastIndexOf('l'));
//   4
//        // 6. String Modification
//        System.out.println("Replace 'l' with 'p': " + str.replace('l', 'p'));
//        System.out.println("ReplaceAll 'o' with 'X': " + str.replaceAll("o", "X"));

//        String s = "   HELLO WORLD   ";
//        System.out.println( s.trim() );
//
//        // 7. Splitting
//        String sentence = "Java is fun";
//        String[] words = sentence.split(" ");
//        System.out.println("Splitting sentence:");
//        for (String word : words) {
//            System.out.println(word);
//        }

//4
//        // 8. Conversion
//        int num = 100;
//        String strNum = String.valueOf(num);
//        System.out.println("String value of number: " + strNum);
//4
//        char[] chars = str.toCharArray();
//        System.out.println("Character array length: " + chars.length);
        //41

        // 9. StringBuilder & StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder Append: " + sb);

        sb.insert(5, " Java");
        System.out.println("StringBuilder Insert: " + sb);

        sb.delete(5, 10);
        System.out.println("StringBuilder Delete: " + sb);
//
        sb.reverse();
        System.out.println("StringBuilder Reverse: " + sb);
    }
}


