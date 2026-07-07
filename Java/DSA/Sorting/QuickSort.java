package DSA.Sorting;

public class QuickSort {
    void quickSort(int arr[]) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int len = arr.length - 1;
        sort(arr, 0, len);
    }

    private void sort(int arr[], int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            sort(arr, left, pivot - 1);
            sort(arr, pivot + 1, right);
        }
    }

    private int partition(int arr[], int left, int right) {
        int pivot = arr[right];

        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 21, 43, 5, 56, 75, 32 };

        QuickSort obj = new QuickSort();
        obj.quickSort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
