package Conditional_Statements;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //Username and password to validate the user
        String userName = "Siddu";
        String passworrd = "Siddu73";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username and Password");

        //input from the User
        String currentUser = sc.next();
        String currentPassword = sc.next();

        if(currentUser.equals(userName) && currentPassword.equals(passworrd)){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
        sc.close();
    }

    
}
