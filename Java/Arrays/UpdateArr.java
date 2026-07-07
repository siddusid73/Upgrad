package Arrays;

import java.util.Arrays;

public class UpdateArr {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        arr[2] = 100;
        System.out.println("Updated Array" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 20 && arr[i] < 40) {
                arr[i] = 100;
            }
        }
    }
}
