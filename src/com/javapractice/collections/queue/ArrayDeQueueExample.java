package com.javapractice.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDeQueueExample {
    public static void main(String[] args) {
        Queue<Integer> numberQueue = new ArrayDeque<>();

        // Adding elements to the queue
        numberQueue.add(10);
        numberQueue.add(20);
        numberQueue.add(50);
        numberQueue.add(30);
        numberQueue.add(40);
     //   numberQueue.add(null); // Adding null is noy allowed in ArrayDeque, but not recommended in practice

        System.out.println("Queue after adding elements: " + numberQueue);


        while(!numberQueue.isEmpty()){
            int number =   numberQueue.poll(); // removes the head of the queue
            System.out.println("Removed element: " + number);
            System.out.println("Queue after removing elements: " + numberQueue);
        }

        System.out.println("Poll on empty Queue"+ numberQueue.poll());

        System.out.println("Remove on empty Queue"+ numberQueue.remove());








    }
}