class MergeSort { 
    public static void merge(int arr[], int start, int mid, int end) {
        int m1 = mid - start + 1;
        int m2 = end - mid;

        int temp1[] = new int[m1];
        int temp2[] = new int[m2];

        for(int i = 0; i < m1; i++)
            temp1[i] = arr[start + i];
        for(int j = 0; j < m2; j++)
            temp2[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = start;

        while(i < m1 && j < m2) {
            if(temp1[i] <= temp2[j]) {
                arr[k] = temp1[i];
                i++;
            } else {
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }

        while (i < m1) {
            arr[k] = temp1[i];
            i++;
            k++;
        }

        while (j < m2) {
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            // merge the arr subarrays
            merge(arr, start, mid, end);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("\nSorted Array");
        printArray(arr);
    }
}