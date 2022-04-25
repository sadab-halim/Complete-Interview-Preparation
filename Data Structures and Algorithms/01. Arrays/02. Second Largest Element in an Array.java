class Main {
    public static int secLargest(int arr[]) {
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
        return arr[total - 2];
    }

    public static void main(String[] args) {
        int arr[] = {44, 66, 77, 99, 22, 11, 33};
        System.out.println(secLargest(arr));
    }
}