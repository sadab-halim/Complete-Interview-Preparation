/* -------------- TRANSPOSE OF A MATRIX -------------- */

/* -------------- NAIVE METHOD, T.C: O(n^2), A.S: O(n) --------------*/
class Main {
    static int n = 4;
    
    public static void transpose(int mat[][]) {
        int temp[][] = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                temp[i][j] = mat[j][i];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = temp[i][j];
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        transpose(arr);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

/* -------------- EFFICIENT METHOD, T.C: O(n), A.S: O(n) --------------*/
class Main {
    static int n = 4;

    public static void swap(int arr[][], int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    public static void transpose(int arr[][]) {
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                swap(arr, i, j);
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        transpose(arr);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}