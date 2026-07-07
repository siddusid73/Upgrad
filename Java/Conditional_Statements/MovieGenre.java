package Conditional_Statements;

import java.util.Scanner;

public class MovieGenre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Genre");

        int genre = sc.nextInt();
        String result;

        switch (genre) {
            case 1:
                result = "Action";
                break;
            case 2:
                result = "Dark";
                break;
            case 3:
                result = "Romance";
                break;
            case 4:
                result = "Action and Adventure";
                break;
            case 5:
                result = "Thriller";
            default:
                result = "No Match";
                break;
        }
        System.out.println("Movie Genre:" + result);
    sc.close();
    }
}
