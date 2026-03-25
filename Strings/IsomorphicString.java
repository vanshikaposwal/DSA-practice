package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicString {
    public static void main(String[] args){
        String s = "bash";
        String t  = "baba";
        System.out.println(isIsomorphic(s,t));
    }
    static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Character> map = new HashMap<>();

        for (int i=0; i<s.length(); i++){

            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!= t.charAt(i)){
                    return false;
                }
            }else {
                if(!set.contains(t.charAt(i)))
                {
                    map.put(s.charAt(i), t.charAt(i));
                    set.add(t.charAt(i));
                }else {
                    return false;
                }
            }
        }

        return true;
    }
}
