import java.util.*;
public class sort {
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionsort(int arr[]) {
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){//for assending order while(prev>=0 && arr[prev] <curr)
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        int num[] = new int[largest+1];
        for(int i = 0;i < arr.length;i++){
            num[arr[i]]++;
        }
        int j  = 0;
        for(int i = num.length-1 ;i>=0;i--){//for assending for(int i = 0;i<num.length;i++)
            while(num[i]>0){
                arr[j] = i;
                j++;
                num[i]--;
            }
            
        }
    }
   
    public static void main(String args[]) {
        int arr[] = { 3, 4, 1, 6, 5, 2, 8, 7, 9 };
        // bubblesort(arr);
        // selectionsort(arr);
        // insertionsort(arr);
        // countingsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
