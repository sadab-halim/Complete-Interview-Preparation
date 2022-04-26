/* --------------- NAIVE METHOD ----------------- */
class Main {
    // function of bubble sort
    public static void bubbleSort(int arr[]) {
        int size = arr.length;

        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - (i - 1); j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

/* --------------- EFFICIENT METHOD ----------------- */
class Main {
    // function of bubble sort
    public static void bubbleSort(int arr[]) {
        int size = arr.length;

        for(int = 0; i < (size - 1); i++) {
            boolean swapped = false;
            for(int j = 0; j < (size - i - 1); j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
}