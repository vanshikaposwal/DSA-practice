package Array;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args){
        int[] arr = {1,3,4,5,5,5,5,5,5,8,9,2,3,5};
        rotate(arr, 8);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k){
        int len = arr.length;
        for(int i=0; i< len/2; i++ ){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }

        for(int i = 0; i<k/2; i++){
            int temp = arr[i];
            arr[i] = arr[k-i-1];
            arr[k-i-1] = temp;
        }
        int i=k;
        for(int j=1; j<=(len-k)/2 ; j++){
            int temp = arr[i];
            arr[i] = arr[len-j];
            arr[len-j] = temp;
            i++;
        }
    }
}
