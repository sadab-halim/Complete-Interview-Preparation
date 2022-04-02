class Main {
    /* -------------------- Naive Method, T.C: O(n), A.S: O(1) ---------------------- */
    public static int findPeak(int[] arr, int n) {
        // Edge cases
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }

    /* ---------------------------- T.C: O(logn), A.S: O(1) ----------------------- */
    public static int findPeakEff(int[] arr, int n) {
        return findPeakUtil(arr, 0, n - 1, n);
    }

    public static int findPeakUtil(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n -1 || arr[mid + 1] <= arr[mid]))
            return mid;
        else if (mid > 0 && (arr[mid - 1] > arr[mid]))
            return findPeakUtil(arr, low, (mid - 1), n);
        else
            return findPeakUtil(arr, (mid + 1), high, n);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of peak element is: " + findPeak(arr, n));
        System.out.println();
        System.out.println("Index of peak element is: " + findPeakEff(arr, n));
    }
}