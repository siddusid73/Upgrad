package Operations;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side:");

        int side = sc.nextInt();
        double result;
        result = side * side;

        System.out.println("Area of square:" + result);
        sc.close();
    }

}
