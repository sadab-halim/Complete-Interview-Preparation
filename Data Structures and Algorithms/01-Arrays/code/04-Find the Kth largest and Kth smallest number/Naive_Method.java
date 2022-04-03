import java.util.Arrays;
import java.util.Collections;

/* ------------------- T.C: O(nlogn) -------------------- */
class Naive_Method {
    public static int kthSmallest (int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr = new int[] {12, 3, 5, 7, 19};
        int k = 2;
        System.out.println("Kth smallest element is " + kthSmallest(arr, k));
    }
}