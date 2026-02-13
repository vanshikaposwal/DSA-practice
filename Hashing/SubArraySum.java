package Hashing;
import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(subarraySum(arr, 2));
    }
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        int sum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int right=0;
        while(right<nums.length && nums[right]<=k ){
            sum+=nums[right];
            int remaining = k-sum;
            if(map.containsKey(remaining)){
                count ++;
                sum = 0;
            }
            map.put(nums[right], right);
            right++;
        }
        return count;
    }
}
