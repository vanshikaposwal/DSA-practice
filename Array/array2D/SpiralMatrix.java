package Array.array2D;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] m={{1,2,3},{4,5,6},{7,8,9}};
        ;
        System.out.println(Arrays.toString(printSpiralRecursive(m)));
    }
    static int[] printSpiralRecursive(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] arr = new int[m*n];
        int top = 0, left =0;
        int right = n-1, bottom = m-1;
        int i=0;

        while(top <= bottom && right>=left){

            // 1. left -> right
            for( int j= left; j<=right; j++){
                arr[i++] = matrix[top][j];
            }
            top++;

            // 2. top-> bottom
            for(int j=top; j<=bottom; j++){
                arr[i++] = matrix[j][right];
            }
            right--;


            if(top <= bottom){
                for(int j=right; j>=left; j--){
                    arr[i++] = matrix[bottom][j];
                }
                bottom--;
            }

            if(left<=right){
                for(int j=bottom; j>=top; j--){
                    arr[i++] = matrix[j][left];
                }
                left++;
            }

        }


        return arr;
    }
}
