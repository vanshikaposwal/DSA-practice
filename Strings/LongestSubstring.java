package Strings;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbbcchfedgfg"));
        System.out.println(longestSubstringWithDistinct("abcbbcchfedgfg", 6));
    }

    static int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0, right=0;
        int maxLength= 0, currLength=0;
        for(;right<s.length();right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch)+1);
            }
            map.put(ch, right);
            currLength = right-left+1;
            maxLength = Math.max(maxLength, currLength);
        }
        return maxLength;

    }


    // longest SubString with at most K distinct Characters

    static String longestSubstringWithDistinct(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0, right=0;
        int maxLength= 0, currLength=0;
        for(;right<s.length();right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch)+1);
            }
            map.put(ch, right);
            currLength = right-left+1;
            if(currLength == k){
                return s.substring(left, (right+1));
            }

        }
        return "";

    }
}
