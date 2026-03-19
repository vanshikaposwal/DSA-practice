package Array;

import java.util.Arrays;

public class RearrangeArrayElementBySign {
    public static void main(String[] args){
        int[] arr ={-1,1,1,-1,3,4,-2,-4,-1,-3,3,5};

        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    static int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int p=0, n=1;


        for(int i=0; i<arr.length; i++){
            if(nums[i]>=0){
                arr[p] = nums[i];
                p+=2;
            }else {
                arr[n] = nums[i];
                n+=2;
            }
        }


        return arr;
    }
}
