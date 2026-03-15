package Array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args){
        int[] array = {0,0,0,0,1,0,0,0,3,2,0,0,2,0,20,3,0,2,0};
        zerosToEnd(array);
        System.out.println(Arrays.toString(array));
    }

    public static void zerosToEnd(int[] arr){
        int zeros =0;
        int leftIndex = 0;
        for(int num:arr){
            if(num!=0){
                arr[leftIndex] = num;
                leftIndex++;
            }else{
                zeros++;
            }
        }

        if(arr.length == zeros){
            return;
        }else{
            int j = arr.length-1;
            while(zeros !=0){
                arr[j] = 0;
                j--;
                zeros--;
            }
        }
    }
}
