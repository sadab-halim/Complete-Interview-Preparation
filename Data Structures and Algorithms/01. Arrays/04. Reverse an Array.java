class Main {
    public static void reverse(int arr[]) {
        int size = arr.length;
        int low = 0;
        int high = size - 1;
        
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(reverse(arr););
    }
}