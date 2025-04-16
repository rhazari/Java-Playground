package org.raihan.basics.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        // Create a blocking queue using the ArrayBlockingQueue
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

        // In multithreading processes, we can use put() and take() to block the operation of one thread to synchronize it with another thread.
        // These methods will wait until they can be successfully executed.
        try {
            // Insert element to blocking queue
            numbers.put(2);
            numbers.put(1);
            numbers.put(3);
            System.out.println("BLockingQueue: " + numbers);

            // Remove Elements from blocking queue
            int removedNumber = numbers.take();
            System.out.println("Removed Number: " + removedNumber);
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
