package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,53,4,1,2,6,3,8,1};
        System.out.println(countFreq(arr));
    }

    public static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(Map.Entry <Integer, Integer> e: map.entrySet()){
            int key = e.getKey();
            int value = e.getValue();
            ArrayList<Integer> frqCount = new ArrayList<>();
            frqCount.add(key);
            frqCount.add(value);
            
        list.add(frqCount);
        }
        return list;
    }
}
