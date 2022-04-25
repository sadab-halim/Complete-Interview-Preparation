class Main {
    public static int getLargest(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[total - 1];
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 50, 30, 40, 70};
        System.out.println(getLargest(arr));
    }
}