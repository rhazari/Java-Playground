package org.raihan.basics.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        // Iterator
        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(" ");
        }
        System.out.print("\n");

        // Using the peek() method
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);

        // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int number2 = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number2);

        System.out.println("PriorityQueue: " + numbers);

        // Using custom comparator
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        // Add elements
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(10);
        maxHeap.add(3);

        itr = maxHeap.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(" ");
        }
        System.out.print("\n");

    }
}
