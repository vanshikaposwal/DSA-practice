package Strings;

import java.util.HashMap;

public class CountSubstringsWithDistict {

    public static void main(String[] args){
        String s = "pqpqs";
        System.out.println(countSubstrings(s, 2));
    }

    static int countSubstrings(String s, int k){
        return atMostDistinct(s, k) - atMostDistinct(s, k-1);
    }

    static int atMostDistinct(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();

        int count=0;
        int left=0, right=0;

        for(;right<s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            // till size is greater than k
            while(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            count += right-left+1;
        }
        return count;
    }

}
