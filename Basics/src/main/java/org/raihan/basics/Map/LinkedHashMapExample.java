package org.raihan.basics.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // LinkedHashMap maintains a doubly-linked list internally. Due to this, it maintains the insertion order of its elements.
        // The LinkedHashMap class requires more storage than HashMap. This is because LinkedHashMap maintains linked lists internally.
        // The performance of LinkedHashMap is slower than HashMap.

        // Creating LinkedHashMap of even numbers
        Map<String, Integer> evenNumbers = new LinkedHashMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("Original LinkedHashMap: " + evenNumbers);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("Updated LinkedHashMap(): " + evenNumbers);

        //Creating LinkedHashMap of numbers
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("New LinkedHashMap: " + numbers);
    }
}
