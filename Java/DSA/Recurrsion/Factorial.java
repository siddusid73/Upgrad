package DSA.Recurrsion;

public class Factorial {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 7;
        int result = fact(n);
        System.out.println(result);
    }
}
