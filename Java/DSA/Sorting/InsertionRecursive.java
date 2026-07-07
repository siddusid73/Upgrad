package DSA.Sorting;

public class InsertionRecursive {
    public static void insertionSort(int arr[], int n) {
        // base case is if array is having one element or it is sorted
        if (n <= 1) {
            return;
        }
        // sort first n-1 elements
        insertionSort(arr, n - 1);

        // insert element at its correct position
        int last = arr[n - 1];
        int j = n - 2;

        // move elements arr[0...i-1]
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int arr[] = { 32, 54, 35, 43, 634, 4132 };
        insertionSort(arr, arr.length);
        System.out.print("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + ",");
        }
    }
}
