package Contests.July5;

import java.util.HashMap;

public class p1 {

    static void main() {
        System.out.println(canMakeSubsequence("az", "bzy"));
    }

//    public int maxDigitRange(int[] nums) {
//        int len = nums.length;
//        int[] ranges = new int[len];
//        int i = 0;
//        int maxRange = 0;
//        for (int num : nums) {
//            ranges[i] = findRange(num);
//            maxRange = Math.max(maxRange, ranges[i]);
//            i++;
//        }
//        int sum = 0;
//        for(int j = 0; j<len; j++){
//            if(ranges[i] == maxRange){
//                sum+=nums[i];
//            }
//        }
//        return sum;
//    }

    public int maxDigitRange(int[] nums) {
        int len = nums.length;
        int maxRange = 0;
        int sum=0;
        for (int num : nums) {
            int range = findRange(num);
            if(range> maxRange){
                maxRange = range;
                sum=num;
            }else if(range == maxRange){
                sum+=num;
            }
        }

        return sum;
    }

    public int findRange(int num){
        int largest = 0;
        int smallest = 9;
        while(num!=0){

            int digit = num%10;
            largest = Math.max(largest, digit);
            smallest = Math.min(smallest, digit);

            num = num/10;
        }
        return largest-smallest;
    }

    public static boolean canMakeSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int i=0, j=0;
        int count=0;
        int lastMatchedIndex = -1;
        while (i<sArr.length && j<tArr.length){
            if(sArr[i] != tArr[j]){
                j++;
            }else if (sArr[i] == tArr[j]){
                i++;
                lastMatchedIndex = j;
                j++;
            }
            if(count<1 && j==tArr.length-1 && sArr[i] != tArr[j]){
                j=lastMatchedIndex+1;
                sArr[i] = tArr[j];
                i++;
                j++;
                count++;
            }


            if(i == sArr.length){
                return true;
            }
        }
        return false;
    }
}
