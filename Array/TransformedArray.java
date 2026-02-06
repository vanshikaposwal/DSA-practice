package Array;

import java.util.Arrays;

public class TransformedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] result = constructTransformedArray(arr);
        System.out.println(Arrays.toString(result));
    }

    



    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            if(nums[i]>0){
                int steps = nums[i];
                int index = 0;
                for(int right=1; right<=steps; right++){
                    index = (i+right)%n;
                }
                result[i] = nums[index];
            }

            else if(nums[i]<0){
                int steps = Math.abs(nums[i]);
                int index =0;
                for(int left=steps; left>0; left--){
                    index = (i+left)%n;
                }
                result[i] = nums[index];
            }

            else if(nums[i] == 0){
                result[i] = nums[i];
            }
        }
        return result;
    }
}
