package org.raihan.basics.Map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        // Keys of weak hashmaps are of weak reference type.
        // This means the entry of a map are removed by the garbage collector if the key to that entry is no longer used.
        // This is useful to save resources.

        // Creating WeakHashMap of numbers
        Map<String, Integer> numbers = new WeakHashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("WeakHashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();
        System.out.println("WeakHashMap after garbage collection: " + numbers);
    }
}
