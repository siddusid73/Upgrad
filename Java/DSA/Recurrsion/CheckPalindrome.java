package DSA.Recurrsion;

public class CheckPalindrome {
    static int rev = 0;
    static void reverse(int n){
        if(n ==0){
            return;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        reverse(n / 10);
    }

    public static void main(String[] args) {
        int n = 337733;
        int original = n;
        reverse(n);
        if(original == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
