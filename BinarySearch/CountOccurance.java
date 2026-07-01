package BinarySearch;

public class CountOccurance {
    public static void main(String[] args){
        int[] nums={1, 1, 2, 2, 2, 2, 2, 3};
        System.out.println(findCount(nums, 4));
    }

    public static int findCount(int[] nums, int target){
        int startIndex = firstPosition(nums, target);
        if (startIndex==-1) return 0;
        int count=0;
        for(int i = startIndex; i<nums.length; i++){
            if(nums[i] == target){
                count++;
            }else break;
        }
        return count;
    }

    public static int firstPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int mid=0;
        while(low<=high){
            mid = low+ (high - low)/2;
            if(nums[mid] == target){
                if(mid>0 &&(nums[mid-1] == target )){
                    high = mid-1;
                }else{
                    return mid;
                }
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}

