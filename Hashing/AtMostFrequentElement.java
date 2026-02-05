package Hashing;

import java.util.HashMap;
import java.util.Map;

public class AtMostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(maxFrequency(arr, 3));
    }

    public static int maxFrequency(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;

        // iterating every element
        for(int i=0; i<length; i++){

            
            int curr = i;

            // iterating elements other than current element
            for(int j=0; j< length; j++){
                int index = (curr+j)%length;
                if(curr == j){
                    continue;
                }
                // diff of 2 element
                int diff = Math.abs(nums[curr]-nums[index]);
                //checking if diff is lesser
                if(diff<=k){
                    // increasing the count of current element
                    int key = Math.max(nums[curr],nums[index]);
                    map.put(key, map.getOrDefault(key, 0)+1);
                    // If any element has count equals to length stops
                    if(map.get(key) == length){
                        return length;
                    }
                }else{
                    // element exist once
                    map.put(nums[i], 1);
                }
            }
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> e: map.entrySet ()){
            if(e.getValue()>max){
                max = e.getValue();
            }
        }
        return max;
    }
}
