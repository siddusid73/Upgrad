package DSA.Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "1221";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // to Check Palindrome String
        if (str.equals(reversed)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}
