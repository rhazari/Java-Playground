package org.raihan.basics.OOP;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {
        // this will refer to the object SMALL
        return switch(this) {
            case SMALL -> "small";
            case MEDIUM -> "medium";
            case LARGE -> "large";
            case EXTRALARGE -> "extra large";
            default -> null;
        };
    }
}

class Test {
    Size pizzaSize;
    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza() {
        switch(pizzaSize)  {
            case SMALL -> System.out.println("I ordered a small size pizza.");
            case MEDIUM -> System.out.println("I ordered a medium size pizza.");
            default -> System.out.println("I don't know which one to order.");
        }
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Test t1 = new Test(Size.MEDIUM);
        t1.orderPizza();
        System.out.println("The size of the pizza is " + Size.SMALL.getSize());
    }
}
