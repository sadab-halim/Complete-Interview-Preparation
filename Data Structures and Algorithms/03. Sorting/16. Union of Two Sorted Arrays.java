/* Find the union of two sorted arrays. Given 2 sorted arrays
    print elements of both the arrays
*/

/*
Example:
Input: A: [1 2 3 3 4 5 6], B: [3 3 5]
Output: [1 2 3 3 3 3 4 5 5 6] 
*/

/* -------------- APPROACH -------------- 
1. Scan both arrays simultaneously
2. Compare element of both the array and print the smaller value
3. Increment the counter of the array with the smaller value
4. After smaller array is completed. Print out the remaining elements of the larger array.
*/

class Main {
    public static void union(int A[], int B[]) {
        int i - 0, j = 0;

        while(i < A.length && j < B.length) {
            if(A[i] < B[j]) {
                System.out.print(A[i] + " ");
                i++;
            } else if (A[i] > B[j]) {
                System.out.print(B[j] + " ");
                j++;
            } else {
                System.out.print(A[i] + " ");
                i++;
                j++;
            }
        }

        while(i < A.length) {
            System.out.print(A[i] + " ");
            i++;
        }

        while(j < B.length) {
            System.out.print(B[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6};
        int B[] = {4, 9, 13, 15, 16, 17};
        
        union(A, B);
    }
}