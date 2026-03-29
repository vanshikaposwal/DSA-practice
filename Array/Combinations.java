package Array;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Combinations {
    public static void main(String[] args){
        System.out.println(combine(4,2));
    }
    static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> list = new ArrayList<>();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        int j=0;
        int z=j+1;

        return list;
    }

    static void backtracking(int n, int k){
        
    }

}
