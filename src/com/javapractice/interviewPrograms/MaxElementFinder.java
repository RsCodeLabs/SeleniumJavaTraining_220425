package com.javapractice.interviewPrograms;

/**
 * Finds the maximum element in an array.
 */
public class MaxElementFinder {
    /**
     * Finds the maximum element in an array.
     *
     * @param array the array to find the maximum element in
     * @return the maximum element
     */
    public static int findMaxElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 3, 4, 5};
        int maxElement = findMaxElement(array);
        System.out.println("Max Element: " + maxElement);
    }
}

