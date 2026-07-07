package OOPS.Constructor;

public class RectangleConstruct {
    double length;
    double width;

    RectangleConstruct(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double caluclateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        RectangleConstruct rect = new RectangleConstruct(15, 10);
        System.out.println("Area of Rectangle:" + rect.caluclateArea());
    }

}
