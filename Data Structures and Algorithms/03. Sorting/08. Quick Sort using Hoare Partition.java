import java.io.*;

class Main {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
    
        while(true) {
            do {
                i++;
            } while (arr[i] < pivot);
    
            do {
                j--;
            } while(arr[j] > pivot);
    
            if(i >= j)
                return j;
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void printArray(int arr[]) {
        for(int a: arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 17, 18, 9, 11, 15};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        printArray(arr);
    }
}