import java.io.*;

class Main {
    public static int partition(int arr[]){
        int pivot = arr[high];
        int index = low - 1;
    
        for(int i = low; i < high; i++) {
            if(arr[i] < pivot) {
                index++;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    
        int pivotPos = ++index;
    
        temp = arr[index] 
        arr[index] = pivot;
        arr[high] = temp;
    
        return pivotPos;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot_pos = partition(arr, low, high);
            quickSort(arr, low, pivot_pos - 1);
            quickSort(arr, pivot_pos + 1, high);
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