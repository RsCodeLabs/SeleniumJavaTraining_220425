//package com.javapractice.interviewPrograms;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//
//public class findDuplicatesUsingHashMap {
//    public static void main(String[] args) {
//        int[] inputArray = {3,4,8,4,10};
//
////        private static void findDuplicatesUsingSorting(int[] inputArray);
////        {
////            Arrays.sort(inputArray);
////
////            for (int i = 0; i < inputArray.length - 1; i++) {
////                if (inputArray[i] == inputArray[i + 1]) {
////                    System.out.println("Duplicate Element : " + inputArray[i]);
////                }
////            }
//
////            HashSet<Integer> set = new HashSet<>();
////
////            for (int element : inputArray) {
////                if (!set.add(element)) {
////                    System.out.println("Duplicate Element : " + element);
////                }
////            }
////        System.out.println(""+set);
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : inputArray) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        // Step 3: Iterate through the hashmap to find
//        // duplicates
//        for (Map.Entry<Integer, Integer> entry :
//                freqMap.entrySet()) {
//            if (entry.getValue() > 1) {
//                result.add(entry.getKey());
//            }
//        }
//
//        // Step 4: If no duplicates found, add -1 to the
//        // result
//        if (result.isEmpty()) {
//            result.add(-1);
//        }
//
//        // Step 6: Return the result list containing
//        // duplicate elements or -1
//        return result;
//
//        }
//}
