package Array;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // first check if i-1 < i
        // if yes then set i-1 = i
        // reverse the previous array
        // then set replaced element at last;
        int index=-1;
        for(int i = nums.length-1; i>0; i--){
            if(nums[i-1] < nums[i]){
                index =i-1;
                break;
            }
        }

        if(index == -1){
            for(int i=0; i<=nums.length/2; i++){
                int temp = nums[i];
                nums[i] = nums[(nums.length-i)-1];
                nums[(nums.length-i)-1] = temp;
            }
            return;
        }
        int num = nums[index];
        int numMax=nums[index+1];
        int indexJ=0;
        for(int i=index+1; i<nums.length; i++){
            if(nums[i]>num && nums[i]<numMax){
                numMax = Math.min(numMax, nums[i]);
                indexJ =i;
            }
        }
        nums[index] = nums[indexJ];
        nums[indexJ] = num;
        for(int i=index+1; i<((nums.length/2)+((index+1)/2)); i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-i+index];
            nums[nums.length-i+index] = temp;
        }
    }
}
