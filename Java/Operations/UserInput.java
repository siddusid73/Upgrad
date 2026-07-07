package Operations;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Your Age:");
        int age = scanner.nextInt();

        System.out.println("Enter Your Percentage:");
        double percentage = scanner.nextDouble();

        System.out.println("Have You Appeared In The Exam (true/false):");
        boolean isAppered = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your percentage is: " + percentage);
        System.out.println("Have you appeared in the exam? " + isAppered);

        scanner.close();
    }
}
