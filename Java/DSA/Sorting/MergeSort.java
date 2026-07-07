package DSA.Sorting;

public class MergeSort {
    static void mergeSort(int arr[]){
        if(arr == null || arr.length<=1){
            return;
        }
        int n = arr.length;
        int[] temp = new int [n];
        mergeSort(arr,temp,0,n-1);
    }
    private static void mergeSort(int arr[],int temp[],int left,int right){
        if(left<right){
            int mid = left + (right - left)/2;

            mergeSort(arr,temp,left,mid);//sort first half
            mergeSort(arr, temp, mid+1, right);// sort for secoond half

            merge(arr, temp, left, mid, right);
        }
    }

    private static void merge(int arr[],int temp[],int left,int mid,int right){
        //copy both parts into temp array
        for(int i = left;i<=right;i++){
            temp[i] =arr[i];
        }
        int i = left;
        int j = mid +1;
        int k = left;

        //merge the elements from left to right
        while(i<=mid && j<=right){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        //copy the remaining elements from the array
        while(i<=mid){
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {21,23,54,65,32,57,68,73};

        mergeSort(arr);
        System.out.print("Sorted array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
