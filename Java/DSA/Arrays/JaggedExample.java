package DSA.Arrays;

public class JaggedExample {
    public static int sumOfElements(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2 },
                { 3 },
                { 4, 5, 6 }
        };

        int result = sumOfElements(arr);

        System.out.println("Sum of Elements:" + result);
    }
}
