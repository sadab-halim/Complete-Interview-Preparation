class Main {
    public static boolean isSorted(int arr[]) {
        if(arr == null || arr.length <= 1)
            return true;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1])
                return false;
        } 
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 70, 90};
        System.out.println(isSorted(arr));
    }
}