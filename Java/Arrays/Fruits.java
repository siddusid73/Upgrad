package Arrays;

import java.util.Arrays;

public class Fruits {
    public static void main(String[] args) {
        String[] fruits = new String[4];

        fruits[0] = "Apple";
        fruits[1] = "Mango";
        fruits[2] = "PineApple";
        fruits[3] = "Guava";

        String New = "Watermelon";
        String[] fruits2 = new String[fruits.length + 1];

        // Copying array elements
        for (int i = 0; i < fruits.length; i++) {
            fruits2[i] = fruits[i];
        }
        // Insterting at the last Position
        fruits2[fruits.length] = New;

        // source array
        System.out.println("Source array: " + Arrays.toString(fruits));

        // new array
        System.out.println("New Array" + Arrays.toString(fruits2));
        // delete element from array
        int arr[] = { 10, 20, 30, 40, 50 };
        int position = 2;

        System.out.println(Arrays.toString(arr));

        // Reach the position
        for (int i = position; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];// poinnter moves to next postion
        }
        System.out.println(Arrays.toString(arr));

        // delete element at the last position
        int newArr[] = new int[arr.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));

        // sorting array
        int arr1[] = { 20, 40, 70, 60, 80 };
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
