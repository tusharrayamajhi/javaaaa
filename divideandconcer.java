import java.util.*;
public class divideandconcer {
    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, mid + 1, end);
        mergeSort(arr, start, mid);
        merge(arr, start, end, mid);

    }

    private static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int partindx = partion(arr, si, ei);
        quicksort(arr, partindx + 1, ei);
        quicksort(arr, si, partindx - 1);
    }

    public static int partion(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {

            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static int searchInSortedAndRotedArray(int arr[], int si, int ei, int key) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= key && key <= arr[mid]) {
                return searchInSortedAndRotedArray(arr, si, mid - 1, key);
            } else {
                return searchInSortedAndRotedArray(arr, mid + 1, ei, key);
            }
        } else {
            if (arr[mid] <= key && key <= arr[ei]) {
                return searchInSortedAndRotedArray(arr, mid+1, ei, key);
            } else {
                return searchInSortedAndRotedArray(arr, si, mid-1, key);
            }
        }

    }

    public static void main(String[] args) {
        // int arr[] = {4,3,1,2,6,5,7,9,8};
        // quicksort(arr, 0, arr.length-1);
        // for(int i = 0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }
        int arr[] = { 6, 7, 8, 9, 1, 2, 3, 4, 5 };
        arr[1] = 8;
        for(int i= 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // System.out.println(searchInSortedAndRotedArray(arr, 0, arr.length-1, 8));
        

    }
}
