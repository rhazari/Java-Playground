package org.raihan.basics.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        // get() method to get value
        System.out.println("Map content: " + languages);

        // replace() method
        languages.replace(2, "Golang");
        System.out.println("Map content: " + languages);

        // keyset() as set
        // return set view of keys
        System.out.println("Keys: " + languages.keySet());

        // values() as set
        // return set view of values
        System.out.println("Values: " + languages.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + languages.entrySet());

        // iterate over HashMap
        for(Map.Entry<Integer, String> entry: languages.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }

        // create a treemap
        Map<Integer, String> newLanguages = new TreeMap<>();
        newLanguages.put(5, "Rust");
        newLanguages.put(4, "Haskell");
        System.out.println("TreeMap: " + newLanguages);

        languages.putAll(newLanguages);
        System.out.println("HasMap: " + languages);
    }
}
