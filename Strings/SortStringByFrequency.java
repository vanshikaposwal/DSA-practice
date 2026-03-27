package Strings;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class SortStringByFrequency {
    public static void main(String[] args){
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    static String frequencySort(String s){

        // first store chars with freq in map
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        // create a list of map
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // sort the list according to their values(descending order)
        list.sort((b,a) -> a.getValue().compareTo(b.getValue()));


        //take a string builder
        StringBuilder sb = new StringBuilder();

        // iterate list and add chars to string
        for(Map.Entry<Character, Integer> e:list){
            int count = e.getValue();
            while(count>0)
            {
                sb.append(e.getKey());
                count--;
            }
        }

        return sb.toString();
    }
}
