package Array.array2D;

import java.util.Arrays;

public class Rotate90_OR_Transpose {
    public static void main(String[] args){
        int[][] m = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(m);
        System.out.println(Arrays.deepToString(m));
    }
    static void rotate(int[][] matrix) {
        int[][] rotated = new int[matrix.length][matrix[0].length];
        for(int r=0; r<matrix.length; r++){
            for(int c = 0; c<matrix[r].length; c++){
                rotated[c][matrix.length-r-1] = matrix[r][c];
            }
        }
        for(int r=0; r<matrix.length; r++){
            for(int c = 0; c<matrix[r].length; c++){
                matrix[r][c] = rotated[r][c];
            }
        }
    }
}
