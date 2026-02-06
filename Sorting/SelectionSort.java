package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // selecting min element from unsorted array swaping with right position in sorted array
        // `

        int[] arr = {7,5,8,3,2,9,4};

        // iterating array
        for(int i=0; i<arr.length; i++){
            int min = i; //Taking firest element off unordered list as minimum element
            for(int j=i+1; j<arr.length; j++){
                // comparing minimum element with rest of the eleents in unordered array
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            //swaping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
