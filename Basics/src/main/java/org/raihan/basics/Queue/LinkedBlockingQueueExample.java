package org.raihan.basics.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedBlockingQueue " + animals);

        // Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Element:");
        System.out.println("Using remove(): " + element1);

        // Using poll()
        String element2 = animals.poll();
        System.out.println("Using poll(): " + element2);

        // Using clear()
        animals.clear();
        System.out.println("Updated LinkedBlockingQueue " + animals);

        BlockingQueue<String> birds = new LinkedBlockingQueue<>(5);
        try {
            // Add elements to animals
            birds.put("Crow");
            birds.put("Raven");
            System.out.println("LinkedBlockingQueue: " + birds);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
