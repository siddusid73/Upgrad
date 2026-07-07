package OOPS;

public class MethodOverloading {
    public void display(int a) {
        System.out.println("Single value: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void display(int a, int b, int c) {
        System.out.println("Product: " + (a * b * c));
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.display(10);
        obj.display(10, 20);
        obj.display(2, 3, 4);
    }
}
