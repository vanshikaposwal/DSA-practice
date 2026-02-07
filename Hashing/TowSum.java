package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class TowSum{
    public static void main(String[] args){
        int[] arr = {2,3,4,5,1,3};
        System.out.println(twoSum(arr, 6));
    }
    public static ArrayList<ArrayList<Integer>> twoSum(int[] array, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            // diffrence
            int diff = target - array[i];
            
            // if diffence presents add to list
            if(map.containsKey(diff)){
                // Found a pair
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(map.get(diff));
                list.add(pair);// storing pairs
            }
            map.put(array[i],i);// only stores value whose diff is not present
        }
        return list;

    }
}