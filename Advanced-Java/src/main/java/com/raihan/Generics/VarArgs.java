package com.raihan.Generics;

public class VarArgs {

    public static void printShoppingList(String... args){
        System.out.println("Printing the contents of the shopping list ...");
        for(String item: args){
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args){
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Bananas";
        printShoppingList(item1, item2, item3);
        printShoppingList("Berries", "Cherries", "Kiwi", "Mangoes");
    }
}
