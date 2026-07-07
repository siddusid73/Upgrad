package DSA.Searching;

//Finding num using linear search
public class FindNumLinear {
    public static boolean search_Element(int arr[], int key) {

        // Iterate through array
        for (int i = 0; i < arr.length; i++) {
            // check if current element is matching with key
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 33, 23, 42, 54, 31, 65, 87, 12 };

        int key = 31;
        boolean isPresent = search_Element(arr, key);
        System.out.println("Element is  present?" + isPresent);
    }
}
