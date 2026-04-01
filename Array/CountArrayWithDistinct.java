package Array;

import java.util.HashMap;

public class CountArrayWithDistinct {
    public static void main(String[] args){
     int[] arr = {1,2,1,2,3,4,2};
     System.out.println(subarraysWithKDistinct(arr, 2));

    }

    static int subarraysWithKDistinct(int[] nums, int k) {
        return countSubarrays(nums, k) - countSubarrays(nums, k-1);
    }

    static int countSubarrays(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        int count =0;
        int left=0, right=0;

        for(; right < nums.length; right++){
            int ele = nums[right];
            map.put(ele, map.getOrDefault(ele, 0)+1);

            while(map.size() > k){
                int leftEle = nums[left];
                map.put(leftEle, map.get(leftEle)-1);

                if(map.get(leftEle) == 0){
                    map.remove(leftEle);
                }

                left++;
            }

            count+= right-left+1;
        }

        return count;

    }

}
