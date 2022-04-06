# Rotate Image by 90

## Solution

### Solution 1: Brute Force Approach, T.C: O(n*n), A.S: O(n*n)

**Approach:** Take another dummy matrix of n*n, and then take the first row of the matrix and put it in the last column of the dummy matrix, take the second row of the matrix, and put it in the second last column of the matrix and so on.

**Code:** <br/>

```java:
import java.util.*;

class Main {
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++>) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static void main (String[] args) {
        int arr[][] = {{1, 2, 3}, {4, ,5, 6}, {7, 8, 9}};
        int rotated[][] = rotate(arr);

        System.out.println("Rotate Image:");

        for(int i = 0; i < rotated.length; i++) {
            for(int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Solution 2: Optimized Approach, T.C: O(n*n), A.S: O(1)

**Intuition:** By observation, we see that the first column of the original matrix is the reverse of the first row of the rotated matrix, so that’s why we transpose the matrix and then reverse each row, and since we are making changes in the matrix itself space complexity gets reduced to O(1).

**Approach:**
1. Transpose of the matrix. (transposing means changing columns to rows and rows to columns)
2. Reverse each row of the matrix.

**Code** <br/>

```java:
class Main {
    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++>) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix [j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 -j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static void main (String[] args) {
        int arr[][] = {{1, 2, 3}, {4, ,5, 6}, {7, 8, 9}};
        rotate(arr);

        System.out.println("Rotate Image:");

        for(int i = 0; i < rotated.length; i++) {
            for(int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```