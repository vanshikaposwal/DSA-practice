package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr ={1,0,0,0,1,1,1,1,1,1,1,0,1,1,1,0,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0, count =0;
        for(int element: nums){
            if(element == 1){
                count++;
                if(count>maxCount){
                    maxCount = count;
                }
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
}
