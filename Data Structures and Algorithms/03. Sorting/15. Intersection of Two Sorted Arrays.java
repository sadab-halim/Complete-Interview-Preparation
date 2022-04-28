/* Find the intersection of two sorted arrays. Given 2 sorted arrays
    find all the elements which occur in both the ways
*/

/*
Example:
Input: A: [1 2 3 3 4 5 6], B: [3 3 5]
Output: [3 3 5]
*/

/* ---------- APPROACH ---------- 
1. Scan both arrays simultaneously
2. Compare element of both the arrays
3. If both of the values are the same, print it
4. Else, increment the counter of the array with smaller element
*/

class Main {
    public static void intersection(int A[], int B[]) {
        int i = 0, j = 0;

        while(i < A.length && j < B.length) {
            if(A[i] < B[j]) {
                i++;
            } else if (A[i] > B[j]) {
                j++;
            } else {
                System.out.print(A[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6};
        int B[] = {4, 9, 13, 15, 16, 17};

        intersection(A, B);
    }
}

