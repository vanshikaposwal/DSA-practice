package SlidingWindow;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("   "));
    }

    public static int lengthOfLongestSubstring(String s) {
    
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, currentLength=0;
        for(int right=0,left=0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, (map.get(ch)+1));
            }
            map.put(ch,right);
            currentLength = right -left +1;
            if(maxLength<currentLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
