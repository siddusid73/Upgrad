package DSA.Sorting;

public class BubbleSort {
    static void Bubblesort(int arr[]) {
        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {

                // Swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 52, 67, 134, 76, 8, 5, 76, 15 };
        Bubblesort(arr);

        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
