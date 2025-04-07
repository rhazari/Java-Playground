package org.raihan.basics.List;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // create ArrayList
        List<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);

        // Convert from array to ArrayList
        String[] stringArray = {"apple", "banana", "cherry"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Method 1: Using Arrays.asList()
        List<String> stringList1 = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println("String ArrayList (Arrays.asList()): " + stringList1);

        // Method 2: Using Collections.addAll()
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, intArray);
        System.out.println("Integer ArrayList (Collections.addAll()): " + integerList);

        // Operations
        ArrayList<String> animals = new ArrayList<>();
        // add elements in the arraylist
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        System.out.println("ArrayList: " + animals);
        // get the element from the arraylist
        String str = animals.get(1);
        System.out.print("Element at index 1: " + str);

        // change the element of the array list
        animals.set(2, "Lion");
        System.out.println("Modified ArrayList: " + animals);

        // remove element from index 2
        String str1 = animals.remove(2);
        System.out.println("Updated ArrayList: " + animals);
        System.out.println("Removed Element: " + str1);

        // iterator
        Iterator<String> itr = languages.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print(" ");
        }
    }
}
