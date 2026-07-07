public class 
PalindromeWay1 {
    public static void main(String[] args) {
        String s = "aabbaa";
        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);
        //to compare with strings we use .equals
        if (ans.equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
