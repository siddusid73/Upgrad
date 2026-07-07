package OOPS.Constructor;

public class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double caluclateArea() {
        return side * side;
    }

    public static void main(String[] args) {
        Square sq = new Square(7);
        System.out.println("Area of Square:" + sq.caluclateArea());
    }
}
