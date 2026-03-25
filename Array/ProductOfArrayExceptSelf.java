package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        System.out.println(Arrays.toString(left));

        right[right.length - 1] = 1;
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        System.out.println(Arrays.toString(right));

        for (int i = 0; i < result.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
