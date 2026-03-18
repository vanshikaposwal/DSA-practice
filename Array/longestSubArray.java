package Array;

import java.util.Arrays;
import java.util.HashMap;

public class longestSubArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,-1,1,1,2,0};
        System.out.println(subarrayWithSumK(arr, 6));
    }

    static int subarrayWithSumK(int[] arr, int k){
// ---------- Using Sliding window ----------------- only for positives...
//        int left=0, size=0, sum=0;
//        for(int right=0; right<arr.length; right++){
//            sum+=arr[right];
//            while(sum>k){
//                sum-=arr[left];
//                left++;
//            }
//            if(sum == k){
//                size = Math.max(size, right-left+1);
//            }
//        }



        //  ?????????  ... Sliding window does not work on negatives ....



// ------------------------Using HashMap -----------------------------

        HashMap<Integer, Integer> map = new HashMap<>();
        int size=0, sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum == k){
                size = i+1;
            }
            if(map.containsKey(sum -k )){
                size = Math.max(size, i-(map.get(sum-k)));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }


        return size;
    }
}
