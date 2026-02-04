package Array;

import java.util.HashMap;
import java.util.Map;

public class OddOneOut{
    public static void main(String[] args){
        int[] arr = {1,2,3,2,3,2,2};
        int result = getOddOccurrence(arr);
        System.out.println("Odd times occured element is: " + result);
    }

    static int getOddOccurrence(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int left=0; left<arr.length; left++){
            map.put(arr[left],map.getOrDefault(arr[left], 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();
            
            if(count%2 !=0){
                return element;
            }
        }
        
        return -1;
    }
}