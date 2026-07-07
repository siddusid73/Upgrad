package OOPS;

import java.util.*;

public class Method1 {
    public void greet(String name) {
        System.out.println("Welcome to OOPs " + name);
    }

    public int add(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Method1 obj = new Method1();
        obj.greet("Arjun");

        int sum = obj.add(n1, n2);
        System.out.println("Sum of a & b:" + sum);

        sc.close();
    }
}
