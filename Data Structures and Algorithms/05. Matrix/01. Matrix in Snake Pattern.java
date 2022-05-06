/* ----------- Matrix in a Snake Pattern ----------- */

/* Given a n x n matrix, you have to print the elements of the
   matrix in the snake pattern.
*/

/*
Example:
Input: mat[][] = {{10, 20, 30, 40},
                  {15, 25, 35, 45},
                  {27, 29, 37, 48},
                  {32, 33, 39, 50}};
Output: 10 20 30 40 45 35 25 15 27 29 37 48 50 39 33 32

Input: mat[][] = {{1, 2, 3},
                  {4, 5, 6},
                  {7, 8, 9}};
Output: 1 2 3 6 5 4 7 8 9
*/

/* ---- APPROACH ----
 We traverse all rows. For every row, we check if it is even or odd. If
even, we print from left to right else print from right to left.
*/

import java.util.*;
class Main {
    public static spiralMatrix(int mat[][]) {
        for(int i = 0; i < mat.length; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < mat[0].length; j++)
                    System.out.print(mat[i][j] + " ");
            } else {
                for(int j = mat[0].length - 1; j >= 0; j--)
                    System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = new int[][]
        {
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 27, 29, 37, 48 },
            { 32, 33, 39, 50 }
        };
 
        spiralMatrix(mat);
    }
}