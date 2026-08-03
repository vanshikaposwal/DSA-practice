package BinarySearch;

public class LC81 {

    public boolean search(int[] nums, int target) {
        return backtrackAndSearch(nums,target, 0, nums.length-1);
    }
    public boolean backtrackAndSearch(int[] nums,int target, int low, int high){
        int mid = low + (high - low)/2;
        if(low <= high){

            if(nums[mid] == target){
                return true;
            }

            boolean flag;
            flag = backtrackAndSearch(nums,target, low, mid-1);
            flag = flag == false? backtrackAndSearch(nums,target, mid+1, high) : true;

            return flag;
        }

        return false;


    }
}
