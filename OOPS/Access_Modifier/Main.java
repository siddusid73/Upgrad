package OOPS.Access_Modifier;

class Shape {

    // Method to calculate area
    public void calculateArea() {
        System.out.println("Area calculation for shape");
    }
}

// Circle Class
class Circle extends Shape {

    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding method
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle Class
class Rectangle extends Shape {

    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding method
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Creating Circle object
        Circle c = new Circle(5);

        // Creating Rectangle object
        Rectangle r = new Rectangle(4, 6);

        // Calling methods
        c.calculateArea();
        r.calculateArea();
    }
}