package OOPS.Inheritance;

class Area {
    double radius = 5;
    int length = 7;
    int width = 14;

    public void caluclateArea() {
        System.out.println("Shape Area");
    }
}

class Circle extends Area {
    public void caluclateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area " + area);
    }
}

class Rectangle extends Area {
    public void caluclateArea() {
        int area = length * width;
        System.out.println("Rectangle Area " + area);
    }
}

public class Shape {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.caluclateArea();
        r.caluclateArea();
    }
}
