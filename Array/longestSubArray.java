package Array;

import java.util.Arrays;
import java.util.HashMap;

//public class longestSubArray {
//    public static void main(String[] args){
//        int[] arr = {-3, 2, 1};
//        System.out.println(subarrayWithSumK(arr, 6));
//    }
//
//    static int subarrayWithSumK(int[] arr, int k){
//
//        int left =0, right=0;
//        int count =0;
//        for(right=0; right< arr.length; right++){
//            int sum=0;
//            for(left=right; left < arr.length; left++){
//                sum+= arr[left];
//                if(sum == k){
//                    int len = right-left+1;
//                    if(len>count){
//                        count = len;
//                    }
//                }else if(sum>k){
//            }
//        }
//
//        return 0;
//    }
//}
