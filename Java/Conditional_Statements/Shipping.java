package Conditional_Statements;
import java.util.Scanner;

public class Shipping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amout Spent:");
        int amount = sc.nextInt();

        if(amount>=100){
            System.out.println("Shipping is Free");
        }else if(amount<99 && amount>=50){
            System.out.println("Shipping is $5");
        }else{
            System.out.println("Shipping is &10");
        }
        sc.close();
    }
}
