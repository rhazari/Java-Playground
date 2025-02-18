package org.raihan.basics.OOP;

import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

// put this class in different Dog.java file
class Dog extends Animal {
    // public constructor without parameter
    public Dog() {
    }

    // private constructor with a single parameter
    private Dog(int age) {
    }

    public void display() {
        System.out.println("I am a dog.");
    }

    private void makeSound() {
        System.out.println("Bark Bark");
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // get name of the class
            String name = obj.getName();
            System.out.println("Name: " + name);

            // get the access modifier of the class
            // int modifier = obj.getModifiers();

            // convert the access modifier to string
            // String mod = Modifier.toString(modifier);
            // System.out.println("Modifier: " + mod);

            // get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());

            // get all the declared methods of Dog
            Method[] methods = obj.getDeclaredMethods();
            // create an object of the Method class
            for (Method m : methods) {

                // get names of methods
                System.out.println("Method Name: " + m.getName());

                // get the access modifier of methods
                int modifier = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifier));

                // get the return types of method
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }

            // get all constructors of Dog
            Constructor[] constructors = obj.getDeclaredConstructors();
            for (Constructor c : constructors) {
                // get the name of constructors
                System.out.println("Constructor Name: " + c.getName());

                // get the access modifier of constructors
                // convert it into string form
                int modifier = c.getModifiers();
                String mod = Modifier.toString(modifier);
                System.out.println("Modifier: " + mod);

                // get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
                System.out.println("");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
