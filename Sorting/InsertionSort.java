package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,8,3,2,9,4};

        //iterates unsorted array
        for(int right=1; right<arr.length; right++){
            int current = arr[right];
            //Iterates Sorted part of array
            for(int left=right-1; left>=0; left--){
                if(arr[left]> current&&left==0){
                    arr[left+1] = arr[left];
                    arr[left] = current;
                    break;
                }else if(arr[left]> current){
                    arr[left+1] = arr[left];
                }else{
                    arr[left+1] = current;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
