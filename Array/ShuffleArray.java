package Array;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(shuffle(arr, 4)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int m = 0,index =0;
        while(m<n){
            result[index++] = nums[m];
            result[index++] = nums[m+n];
            m++;
            System.out.println(Arrays.toString(result));
        }
        return result;
    }
}
