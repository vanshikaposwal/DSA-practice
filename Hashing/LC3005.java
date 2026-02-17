package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LC3005 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,1,4,1,5,3,2,3,2};
        System.out.println(maxFrequencyElements(arr));
    }
    public static int maxFrequencyElements(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int maxFreq=0;
        for(int element: nums){
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1);

            }else{
                map.put(element, 1);
            }
            // System.out.println(map);
            int freq = map.get(element);
            if(freq>maxFreq){
                maxFreq = freq;
                // System.out.println(maxFreq);
            }
        }
        int result =0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(maxFreq == e.getValue()){
                result+=maxFreq;
            }
        }
        return result;
    }
}
