class SelectionSort {
    public static void selectionSort(int arr[]) {
        int size = arr.length;
        for(int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < size; j++) {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}