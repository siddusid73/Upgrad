package Operations;


import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area of Rectangle");
        System.out.println("Enter Length: ");
        double lenght = sc.nextDouble();

        System.out.println("Enter Width");
        double width = sc.nextDouble();

        double rectangleArea = lenght * width;
        System.out.println("Area of Rectangle:"+rectangleArea);

        System.out.println("Area of Square");
        System.out.println("Enter side:");
        double side = sc.nextDouble();

        double squareArea = side * side;
        System.out.println("Area of Square:"+squareArea);

        System.out.println("Area of Triangle");
        System.out.println("Enter base:");
        double base = sc.nextDouble();

        System.out.println("Enter height:");
        double height = sc.nextDouble();

        double triangleArea = 0.5*base*height;
        System.out.println("Area of Triangle:"+triangleArea);
        

        System.out.println("Area of Circle");
        System.out.println("Enter Radius:");
        double radius =sc.nextDouble();

        double circleArea =3.14*radius*radius;
        System.out.println("Area of Circle:"+circleArea);

        sc.close();
    }
}
