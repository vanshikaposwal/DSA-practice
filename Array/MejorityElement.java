package Array;

import java.util.Arrays;

public class MejorityElement {
    public static void main(String[] args){
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majority(arr));
    }

    static int majority(int[] arr){
        int max = 0;
        for(int n: arr){
            if(n>max){
                max = n;
            }
        }

        int[] arr1 = new int[max+1];

        for(int n: arr){
            arr1[n]++;
            if(arr1[n]>(arr.length)/2){
                return n;
            }
        }
        return 0;
    }
}
