package com.javapractice.Strings;

public class StringMethodsExample {
    public static void main(String[] args) {
     String name = "RSCode Labs"  ;
     char ch = ' ';

     //1. Length of the string

        System.out.println("Length of the string: " + name.length());

        //2.1 Convert to lower case
        System.out.println("Lower case: " + name.toLowerCase());

        //2.2 Convert to upper case
        System.out.println("Upper case: " + name.toUpperCase());

        //3. SubString Extraction
            System.out.println("SubString: " + name.substring(2, 6).toLowerCase().length()); // Extracts characters from index 2 to 5
        System.out.println("SubString: " + name.substring(2)); // Extracts characters from index 2 to 5

        //Compare two strings
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        String str4 = new String("Hello");
        System.out.println("Are the strings equal? " + str1.equals(str2)); // Content Comparision
        System.out.println("Are the reference same"+ str1==str2); //Refernce Comparision
        System.out.println("Are the strings equal ignoring case? " + str1.equalsIgnoreCase(str2));
        System.out.println("Are the strings equal? " + str1.equals(str3)); // Content Comparision
        System.out.println("Are the reference same"+ str1==str3); //Refernce Comparision


        System.out.println("Are the strings equal? " + str1.equals(str4)); // Content Comparision
        System.out.println("Are the reference same"+ str1==str4); //Refernce Comparision


        //5. Search  Methods
        System.out.println("Contains 'Code': " + name.toLowerCase().contains("code")); // Checks if the string contains "Code"
        System.out.println("Starts with 'RS': " + name.startsWith("RS")); // Checks if the string starts with "RS"
        System.out.println("Ends with 'Labs': " + name.endsWith("Labs")); // Checks if the string ends with "Labs"
        System.out.println("Index of 'S': " + name.indexOf("S")); // Finds the index of the first occurrence of "S"
        System.out.println("Last index of 's': " + name.lastIndexOf("s")); // Finds the index of the last occurrence of "S"
        System.out.println("Index of 'z': " + name.indexOf("z")); // Finds the index of the first occurrence of "Code"

        //6. String Modficaiton
        System.out.println("Replace 'Labs' with 'Academy': " + name.replace("Labs", "Academy")); // Replaces "Labs" with "Academy"

        //Spliit
        System.out.println("Split by space: "+ name.split(" ")); // Splits the string by
        String[] splitString = name.split(" ");
        for(String str : splitString){
            System.out.println(str);
        }

        //String Conversion
        char[] charArray = name.toCharArray() ;
        for(char character: charArray){
            System.out.print(character);// Converts the string to a character array
        }

        int num = 123;
        String strNum = String.valueOf(123);
        System.out.println("String representation of number: " + strNum); // Converts an integer to a string

        //StringBuilder && StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        sb.insert(5, " Java"); // Inserts " Java" at index 5
        System.out.println("StringBuilder: " + sb.toString()); // Converts StringBuilder to string
        // Appends " World" to the string

        sb.delete(5,10);
        System.out.println("StringBuilder after deletion: " + sb.toString()); // Converts StringBuilder to string

        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb.toString()); // Converts StringBuilder to string




    }


}
