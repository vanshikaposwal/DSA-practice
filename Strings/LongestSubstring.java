package Strings;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        // Set
        HashSet <Integer> set =new HashSet<>();

        int[] arr = {1,2,3,8,4,1,5,7,3,2,2,2};
        for(int i: arr){
            set.add(i);
        }

        //  second largest 
        int max = -1;
        int secondMax = -1 ;
            max = -1;
        for(int i: set){
            if(i>max){
                secondMax = max;
                max =i;
            }
        }
        System.out.println(secondMax);
    }
}
