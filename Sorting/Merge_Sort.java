package Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args){
        int[] arr = {1,6,1,3,9,0,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(low == high){
            return;
        }
            int mid = (high + low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int[] arr1 = new int[mid-low+1];
        int[] arr2 = new int[high-mid+1];

        int i1 = 0;
        for(int i=low; i<mid; i++){
            arr1[i1++] = arr[i];
        }

        int i2=0;
        for(int j = mid+1; j<high; j++){
            arr2[i2++] = arr[j];
        }

        int i=0,j=0;
        for(int k= low; k<high; k++){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
        }
    }
}
