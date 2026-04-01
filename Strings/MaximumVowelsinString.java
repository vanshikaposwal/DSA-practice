package Strings;

import java.util.Arrays;
import java.util.Map;


public class MaximumVowelsinString {

    public static void main(String[] args){
        String s ="abciektuoaejk";
        System.out.println(maxVowels(s, 3));
    }
    static int maxVowels(String s, int k){
        Character[] vowls ={'a', 'e', 'i', 'o', 'u'};
        int left = 0;//a
        int count=0;
        int maxCount=0;
        for(int right=0; right<s.length(); right++){ //a,b,c,i,e, k
            if(Arrays.asList(vowls).contains(s.charAt(right))){//a,i,e --
                count++; // 2
            }
            int len = right-left+1; // 4
            if(len>k){
                if(Arrays.asList(vowls).contains(s.charAt(left))){ //
                    count--; //
                }
                left++; // c

            }
            maxCount = Math.max(maxCount, count); // 2
        }

        return maxCount;
    }

}
