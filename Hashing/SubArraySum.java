package Hashing;
import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(subarraySum(arr, 2));
    }
    public static int subarraySum(int[] numbs, int k) {
        int count=0;
        int sum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); // else subarrays starting from index 0 will skip...
        for(int i=0; i<numbs.length; i++){
            sum+= numbs[i];
            if(map.containsKey(sum-k)){
                count+= map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
