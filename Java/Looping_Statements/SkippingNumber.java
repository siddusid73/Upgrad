package Looping_Statements;

public class SkippingNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue; // skip odd numbers
            }
            if (i % 5 == 0) {
                break; //exit the loop if mulitple of 5
            }
            System.out.println("Even Nummbers(Excluding multiple of 5" + i);
        }
    }
}