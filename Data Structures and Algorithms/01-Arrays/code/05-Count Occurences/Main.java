class Main {
    /* --------------------- T.C: O(n) ------------------ */
    public static int countOccurencesNaive(int[] arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }

    /* ---------------------- T.C: O(nlogn) --------------------------- */
    public static int countOccurencesBetter (int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return countOccurencesBetter(arr, 1, x)
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 2;
        System.out.println(countOccurencesNaive(arr, n, x));
    }
}

