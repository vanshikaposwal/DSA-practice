package BinarySearch;

import java.util.Arrays;

public class SearchInRotatedArray {

    public static void main(String[] args){
        int[] arr = {11,13,16,19,0,2,5,6,8,9,10};
        System.out.println(search(arr, 0));
    }

    static int search(int[] nums, int target) {
        int len = nums.length;
        int rotations = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                rotations = i;
                break;
            }
        }

        System.out.print("Before reversed\n"+Arrays.toString(nums));

        // reverse whole array
        reverse(nums, 0, len-1);
        System.out.print("After 1st reverse\n"+Arrays.toString(nums));

        // reverse till the length-rotations
        reverse(nums, 0, ((len-1)-(rotations-1)-1));
        System.out.print("After 2nd reverse\n"+Arrays.toString(nums));

        // reverse remaining elements
        reverse(nums, ((len-1)-(rotations-1)), len-1);
        System.out.print("After 3rd reverse\n"+Arrays.toString(nums));

        int low=0, high=len-1;
        int mid=0;
        while(low <= high){
            mid = low + (high-low)/2;

            System.out.print("\nlow : "+low+"\n");
            System.out.print("high : "+high+"\n");
            System.out.println("mid : "+mid+"\n");


            if(nums[mid] == target){
                return mid + rotations;
            }else if(nums[mid] < target){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return -1;

    }

    static void reverse(int[] nums, int left, int right){

        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
