package Array;

import java.util.Arrays;

public class Sort_0s_1s_2s {
    public static void main(String[] args){
        int[] arr = {1,2,0,0,0,1,1,2,1,0,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int low=0, mid=0,high = arr.length-1;
        while(mid<high){
            if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                mid++;
            }else if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }
}
