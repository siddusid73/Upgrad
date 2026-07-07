package DSA.Arrays;

public class ThreeDexample {
    public static int sumOfElements(int[][][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    sum += arr[i][j][k];
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int[][][] arr = {
                {
                        { 1, 2 },
                        { 3, 4 }
                },
                {
                        { 5, 6 },
                        { 7, 8 }
                }
        };
        int result = sumOfElements(arr);
        System.out.println("Sum of Array Elements:" + result);
    }
}
