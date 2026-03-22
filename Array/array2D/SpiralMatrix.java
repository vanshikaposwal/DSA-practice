package Array.array2D;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] m={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(printSpiralOrder(m)));
    }
    static int[] printSpiralOrder(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] arr = new int[m*n];
        int r=0, c=0, countCol=0, countRow=0;
        int i=0;
        while( i<arr.length){
            if(r == countRow && c != matrix.length-countCol-1){
                arr[i] = matrix[r][c];
                c++;
                i++;
            }else if(r == matrix.length-countRow-1){
                arr[i] = matrix[r][c];
                c--;
                if(c == countCol){
                    countRow++;
                    c++;
                    i--;
                }
                i++;
            }
            if(c == matrix.length-countCol-1){
                arr[i] = matrix[r][c];
                r++;
                i++;
            }else if(c==countCol){
                arr[i] = matrix[r][c];
                r++;
                if(r == countRow){
                    countCol++;
                    i--;
                }
                i++;
            }
        }
        return arr;
    }
}
