class Main {
    public static void reverse(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Before reversing");
        printArr(arr);
        reverse(arr);
        System.out.println("After reversing");
        printArr(arr);
    }
}