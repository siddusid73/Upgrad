package OOPS;

public class ReverseMain {
    public void reverseDigit(int num){
        int reverse = 0;
        while (num !=0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed Number: " + reverse);

    }
}
