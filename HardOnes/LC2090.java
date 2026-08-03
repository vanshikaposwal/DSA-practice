package HardOnes;

import java.util.Arrays;

public class LC2090 {
    static void main() {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        System.out.println(Arrays.toString(getAverages(nums, 3)));

    }

    public static int[] getAverages(int[] nums, int k) {
        int len = nums.length;
        int[] avg = new int[len];

        // array filled with default value -1
        Arrays.fill(avg, -1);

        // if length is less than i+k + i-k +1
        int size = (2*k)+1;
        if(len< size){
            return avg;
        }

        // find average

        long sum=0;
        for (int i = 0; i <= k + k; i++) {
            sum += nums[i];
        }

        avg[k] = (int)(sum/size);

        int center = k+1;

        while (center!=len-k){
            sum= sum-nums[center-k-1];
            sum = sum+nums[center+k];

            avg[center]=(int)(sum/size);
            center++;
        }

        return avg;
    }
}
