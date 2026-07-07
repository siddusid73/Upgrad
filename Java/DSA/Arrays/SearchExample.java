package DSA.Arrays;

import java.util.Scanner;

public class SearchExample {
    public static boolean searchElement(String[][] arr, String searchVal) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals(searchVal)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[][] data = {
                { "Pen","Pencil","Book" },
                { "Eraser","Box" }
        };
        System.out.println("Enter the search key");
        Scanner sc = new Scanner(System.in);
        String searchval = sc.next();

        boolean result = searchElement(data, searchval);
        System.out.println("Search Element is present?" + result);
        sc.close();
    }
}
