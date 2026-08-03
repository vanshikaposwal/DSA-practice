package BinarySearch;

public class LC153 {
    public int findMin(int[] nums) {
        return backtrackAndSearch(nums, 0, nums.length-1);
    }
    public int backtrackAndSearch(int[] nums, int low, int high){
        int mid = low + (high - low)/2;
        if(low == high){
            return nums[mid];
        }

        return Math.min(backtrackAndSearch(nums, low, mid), backtrackAndSearch(nums, mid+1, high));
    }
}
