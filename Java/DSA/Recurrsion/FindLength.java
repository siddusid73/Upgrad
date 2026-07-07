package DSA.Recurrsion;

public class FindLength {
    static int length(String str, int index) {
        try {
            str.charAt(index);
            return 1 + length(str, index + 1);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        int result = length(str, 0);
        System.out.println(result);
    }
}
