/* Binary Search is a Divide and Conquer algorithm.
   It divides a large array into two smaller subarrays and then iteratively (or recursively)
   operate the subarrays instead of operating on both subarrays
*/

/* Given a sorted array arr[] of n elements, write a function to search a given element x in arr[]. */
/*
Examples:
Input: arr[] = {10, 20, 30, 50, 60}, x = 30
Output: 2

Input: arr[] = {10, 20, 30, 50, 60}, x = 40
Output: -1
*/

/* ------------ RECURSIVE IMPLEMENTATION, T.C: O(logn), A.S: O(logn) ------------ */
class Main {
    public static int binarySearch(int arr[], int low, int high, int target) {
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(target == arr[mid])
            return mid;
        else if (arr[mid] < target)
            return binarySearch(arr, mid + 1, high, target)
        else
            return binarySearch(arr, low, mid - 1, target)
    }
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 9, 10 };
        int target = 5;
 
        int low = 0;
        int high = arr.length - 1;
 
        int index = binarySearch(arr, low, high, target);
 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}

/* ------------ ITERATIVE IMPLEMENTATION, T.C: O(logn), A.S: O(1) ------------ */
class Main {
    public static int binarySearch(int arr[], int target) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;
            if(target == arr[mid])
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 9, 10 };
        int target = 5;
 
        int index = binarySearch(arr, target);
 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}