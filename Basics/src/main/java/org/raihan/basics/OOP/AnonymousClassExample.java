package org.raihan.basics.OOP;

/*
Anonymous classes can extend a class or implement an interface but cannot have a constructor.
They have access to the members of their enclosing class and any effectively final local variables.
They are often used with interfaces, functional interfaces, and lambda expressions, making code more concise.*
*/
interface TestInterface {
    public void display();
}

class AnonymousDemo {
    public void createClass() {

        // anonymous class implementing interface
        TestInterface p1 = new TestInterface() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}
