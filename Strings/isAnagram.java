package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class isAnagram {
    public static void main(String[] args){
        String s = "", t="";
        System.out.println(is_Anagram(s,t));
    }
    static boolean is_Anagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }


        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
                if(map.get(t.charAt(i))<0){
                    return false;
                }
            }else{
                return false;
            }
        }

        return true;
    }
}
