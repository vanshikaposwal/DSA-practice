package Array;

public class MaxSumSubarray {
    public static void main(String[] args){
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4,1,-6};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum=0, startIndex=-1, endIndex=-1;
        int start = 0;
        for(int i=0; i<nums.length; i++){
            if(sum == 0){
                start=i;
                System.out.println(start);
            }
            System.out.print(i +" --> ");
            sum+=nums[i];
            System.out.print(sum+" --> ");
            if(sum>maxSum){
                maxSum = Math.max(sum, maxSum);
                System.out.print(maxSum);
                startIndex = start;
                endIndex = i;
                System.out.println("  index "+startIndex+" to "+endIndex);
            }
            if(sum<0){
                sum = 0;
            }
            System.out.println("\n\n");
        }
        return maxSum;

    }
}
