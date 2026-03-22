package Array;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args){
        int[] arr = {4, 7, 1, 0};
        System.out.println(findLeaders(arr));
    }
    static ArrayList<Integer> findLeaders(int[]arr){
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[arr.length-1];
        list.addFirst(max);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] >= max){
                max = arr[i];
                list.addFirst(max);
            }
        }
        return list;
    }
}
