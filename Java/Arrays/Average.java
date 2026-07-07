package Arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        double arr[] = new double[5];

        int len = arr.length;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();

            // sum of array
            sum += arr[i];
        }
        double avg = sum / len;
        System.out.println("Average:" + avg);
        sc.close();
    }
}