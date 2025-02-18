package org.raihan.basics.OOP;

interface Polygon {
    void getArea();

    // default method
    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }

    // calculate the perimeter of a Polygon
    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side: sides) {
            perimeter += side;
        }

        System.out.println("Perimeter: " + perimeter);
    }
}

// implements the interface
class Rectangle implements Polygon {
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    // overrides the getSides()
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}

// implements the interface
class Square implements Polygon {
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}

class Triangle implements Polygon {
    private int a, b, c;
    private double s, area;

    // initializing sides of a triangle
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    // calculate the area of a triangle
    public void getArea() {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // create an object of Rectangle
        Rectangle r1 = new Rectangle();
        r1.getArea();
        r1.getSides();

        // create an object of Square
        Square s1 = new Square();
        s1.getArea();
        s1.getSides();

        Triangle t1 = new Triangle(2, 3, 4);

        // calls the method of the Triangle class
        t1.getArea();

        // calls the method of Polygon
        t1.getPerimeter(2, 3, 4);
    }
}
