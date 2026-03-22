package Array;

import java.util.Arrays;

public class longestConsecutiveSubstring {
    public static void main(String[] args){
        int[] arr = {2,6, 1, 9, 4, 5, 3};
        System.out.println(longestConsecutive(arr));
    }
    static int longestConsecutive(int[] arr) {
        if(arr.length == 0) return 0;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int maxCount = 1;
        int left = 0, count=1;

        for(int right = 1; right < arr.length; right++){

            if(arr[right] == arr[right-1]){
                continue; // skip duplicates
            }

            else if(arr[right] == arr[right-1] + 1){
                // continue sequence
                count++;
                maxCount = Math.max(maxCount, count);
                System.out.print(arr[left]+" - "+arr[right]+" --> ");
                System.out.print(count+" --> ");
                System.out.println(maxCount);
            }

            else{
                count =1;
                left = right; // reset window
            }
        }

        return maxCount;
    }
}
