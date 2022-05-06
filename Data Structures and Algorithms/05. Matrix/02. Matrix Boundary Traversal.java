/* --------------- PRINT BOUNDARY ELEMENTS OF A MATRIX --------------- */

/* 
Given a matrix of size n x m. Print the boundary elements of the matrix. 
Boundary elements are those elements which are not surrounded by elements on all four directions, 
i.e. elements in first row, first column, last row and last column.
*/

/*
Example-1:

Input :
        1 2 3 4  
        5 6 7 8
        1 2 3 4
        5 6 7 8

Output : 
         1 2 3 4 
         5     8 
         1     4 
         5 6 7 8

Explanation:The boundary elements of the
matrix is printed.

Example-2:

Input:
        1 2 3   
        5 6 7 
        1 2 3 

Output: 
        1 2 3   
        5   7 
        1 2 3 

Explanation:The boundary elements of the 
matrix is printed.
*/

/* --------- APPROACH --------- */
/*
1. Traverse the array from start to end.
2. Assign the outer loop to point the row and the inner row to traverse the elements of row.
3. If the element lies in the boundary of matrix, then print the element, i.e. if the element lies in 1st row, 1st column, last row, last column
4. If the element is not boundary element print a blank space.
*/

/* ------------ T.C: O(n), A.S: O(1) ------------ */
class Main {
    static int R = 4, C= 4;

    public static void printBoundary(int arr[][]) {
        if(R == 1){
            for(int i = 0; i < C; i++)
                System.out.print(mat[0][i] + " ");
        } else if(C == 1) {
            for(int i = 0; i < R; i++)
                System.out.print(mat[i][0] + " ");
        } else {
            for(int i = 0; i < C; i++)
                System.out.print(mat[0][i] + " ");
            for(int i = 1; i < R; i++)
                System.out.print(mat[i][C - 1] + " ");
            for(int i = C - 2; i >= 0; i--)
                System.out.print(mat[R - 1][i] + " ");
            for(int i = R - 2; i >= 1; i--)
                System.out.print(mat[i][0] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        printBoundary(arr);
    }
}