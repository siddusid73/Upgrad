package OOPS;

// Comparing 2 integers
public class GreatestNumMain {
    public void greatestNum(int a, int b) {
        if (a > b) {
            System.out.println("Greatest number is " + a);
        } else {
            System.out.println("Greatest number is " + b);
        }
    }

    // Comparing 3 integers
    public void greatestNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Greatest number is " + a);
        } else if (b > c) {
            System.out.println("Greatest number is " + b);
        } else {
            System.out.println("Greatest number is " + c);
        }
    }
}
