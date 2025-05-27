package com.javapractice.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethodsDemo {
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();

        //1. add Element
        queue.add("Apple");
        queue.add("Banana");


        //2. Offer Element
        queue.offer("Cherry");

        //Display the queue
        System.out.println("Queue after adding elements: " + queue);

        //3. Remove Element
        String removedElement = queue.remove(); // Removes the head of the queue
        System.out.println("Removed Element: " + removedElement);

        //4. Poll Element
        String polledElement = queue.poll(); // Retrieves and removes the head of the queue, or returns null if the queue is empty
        System.out.println("Polled Element: " + polledElement);

        //5. element
        String headElement = queue.element(); // Retrieves, but does not remove, the head of the queue
        System.out.println("Head Element: " + headElement);

        queue.add("Date");
        queue.add("Elderberry");
        System.out.println("Queue after adding elements: " + queue);

        //6. Peek Element
        String peekedElement = queue.peek(); // Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty
        System.out.println("Peeked Element: " + peekedElement);

        //7. Size of the queue
        int size = queue.size(); // Returns the number of elements in the queue

        System.out.println("Size of the queue: " + size);
        //8. Check if the queue is empty
        boolean isEmpty = queue.isEmpty(); // Returns true if the queue is empty, false otherwise
        System.out.println("Is the queue empty? " + isEmpty);

        //9. Clear the queue
        queue.clear(); // Removes all elements from the queue
        System.out.println("Queue after clearing: " + queue);

    }
}

