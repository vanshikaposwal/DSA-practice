package Array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,6,8};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] arr){
        int k=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        arr[k] = arr[arr.length-1];
        return k+1;
    }
}
