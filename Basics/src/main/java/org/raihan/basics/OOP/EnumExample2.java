package org.raihan.basics.OOP;

enum PizzaSize {

    // enum constants calling the enum constructors
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    // private enum constructor
    private PizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}

public class EnumExample2 {
    public static void main(String[] args) {
        PizzaSize size = PizzaSize.SMALL;
        System.out.println(size.getSize());

        // String representation
        System.out.println(PizzaSize.LARGE.toString());



    }
}
