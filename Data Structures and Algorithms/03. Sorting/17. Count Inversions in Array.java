/* Given an array, find the total number of inversions of it. If (i < j) and (A[i] > A[j]), then pair (i, j) is called an inversion of an array A */

/*
Example:

Input: A[]: {1, 9, 6, 4, 5}
Output: The inversion count is 5
Explanation: There are 5 inversions in the array: (9, 6), (9, 4), (9, 5), (6, 4), (6, 5)
*/

/* ---------------- NAIVE METHOD, T.C: O(n^2) ---------------- */
class Main {
    public static int countInversion(int arr[]) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 6, 4, 5};
        System.out.println("The inversion count is " + countInversion(arr));
    }
}


/* ---------------- EFFICIENT METHOD, T.C: O(n^2) ---------------- */
/* using merge sort */

class Main {
    public static int merge(int arr[], int aux[], int low, int mid, int high) {
        int k = low, i = low, j = mid + 1;
        int count = 0;

        while(i <= mid && j <= high) {
            if(arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while(i <= mid) {
            aux[k++] = arr[i++];
        }

        for(i = low; i <= high; i++)
            arr[i] = aux[i];
        
        return count;
    }

    public static int mergesort(int arr[], int aux[], int low, int high) {
        if(high <= low)
            return 0;
        int mid = (low + ((high - low) >> 1));
        int count = 0;

        count += mergesort(arr, aux, low, mid);
        count += mergesort(arr, aux, mid + 1, high);
        count += merge(arr, aux, low, mid, high);

        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 9, 6, 4, 5 };
        int[] aux = Arrays.copyOf(arr, arr.length);
 
        System.out.println("The inversion count is " +
                        mergesort(arr, aux, 0, arr.length - 1));
    }
}