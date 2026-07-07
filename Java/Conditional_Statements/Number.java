package Conditional_Statements;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Number is Postive");
        }else if(num<0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Numberis Zero");
        }
        sc.close();
    }
}
