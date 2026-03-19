package Array;

import java.util.Arrays;

public class MejorityElement {
    public static void main(String[] args){
        int[] arr = {7, 1, 0, 1, 1, 7, 1, 1, 7,1,1,0,1,1,6,1,0,1,4,};
        System.out.println(majority_Wth_BM(arr));
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

    // Using Boyer-Moore Algo --> Candidate with max votes will be the last

    static int majority_Wth_BM(int[] arr){
        int count=0;
        int ele=0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            if(count ==0){
                ele = arr[i];
            }
            if(ele == curr){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
}
