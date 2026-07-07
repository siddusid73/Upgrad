package DSA.Recurrsion;

public class CountDigits {

    static int count(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        int n = 2479;
        int result = count(n);
        System.out.println(result);
    }
}
