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
            int diff = target - array[i];
            if(map.containsKey(diff)){
                // Found a pair
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(map.get(diff));
                list.add(pair);
            }
            map.put(array[i],i);
        }
        return list;

    }
}