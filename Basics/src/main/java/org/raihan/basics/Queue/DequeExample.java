package org.raihan.basics.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        // Stack implementation from Dequeu
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(5);
        stack.push(11);
        stack.push(15);

        while(!stack.isEmpty()) {
            System.out.print(stack.poll());
            System.out.print(" ");
        }

        // LinkList using Deque
        Deque<String> linkList = new LinkedList<>();
        // add element at the beginning
        linkList.offer("Cow");
        System.out.println("LinkedList: " + linkList);

        linkList.offerFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + linkList);

        // add elements at the end
        linkList.offerLast("Zebra");
        System.out.println("LinkedList after addLast(): " + linkList);

        // remove the first element
        linkList.pollFirst();
        System.out.println("LinkedList after removeFirst(): " + linkList);

        // remove the last element
        linkList.pollLast();
        System.out.println("LinkedList after removeLast(): " + linkList);
    }
}
