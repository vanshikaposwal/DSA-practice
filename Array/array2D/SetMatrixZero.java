package Array.array2D;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args){
        int[][] m = {{1,1,1},{1,0,1},{0,1,1}};
        setZeroes(m);
        System.out.println(Arrays.deepToString(m));
    }
    static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Step 1: Detect zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: Apply changes using your functions
        for (int i = 0; i < m; i++) {
            if (rows[i]) setRowZero(matrix, i, 0);
        }

        for (int j = 0; j < n; j++) {
            if (cols[j]) setColumnZero(matrix, j, 0);
        }
    }
    static void setColumnZero(int[][] matrix, int c, int row){
        for(int r=0; r<matrix.length; r++){
                matrix[r][c] = 0;
        }
    }
    static void setRowZero(int[][] matrix, int r, int col){
        for(int c=0; c<matrix[r].length; c++){
            matrix[r][c] = 0;

        }
    }
}
