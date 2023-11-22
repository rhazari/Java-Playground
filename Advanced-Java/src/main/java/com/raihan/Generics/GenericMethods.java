package com.raihan.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    static Character[] charArray = {'h','e','l','l','o'};
    static Integer[] intArray = {1,2,3,4,5,6};
    static Boolean[] boolArray = {true, false, false, true, false};

    public static<T> List<T> arrayToList(T[] array, List<T> list){
        for(T elem: array){
            list.add(elem);
        }
        return list;
    }

    public static<T> void displayList(List<T> list){
        for(T elem: list){
            System.out.print(elem + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());

        displayList(charList);
        displayList(boolList);
        displayList(intList);
    }
}
