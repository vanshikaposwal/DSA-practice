package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,1,5,8,3,2,9,4};
        int n = arr.length;
        //iterating array
        while(n>0){
            boolean flag = false;
            for(int i=0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp= arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
