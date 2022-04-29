import java.io.*;

class Main {
    public static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int left = low;
        int right = high - 1;

        while (left <= right) {
            while(array[left] < pivot) {
                left++;
            }
            while(array[right] > pivot) {
                right--;
            }
            if(left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        int temp = array[left];
        array[left] = array[high];
        array[high] = temp;

        return left;
    }

    public static void quicksort(int array[], int low, int high) {
        if(low < high) {
            int pivot_pos = partition(array, low, high);
            quicksort(array, low, pivot_pos - 1);
            quicksort(array, pivot_pos + 1, high);
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
        quicksort(arr, 0, n - 1);
        printArray(arr);
    }
}
