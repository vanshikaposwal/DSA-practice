package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr ={1,0,1,1,1,1,0,0,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] numb) {
        int maxCount = 0;
        int count = 0;
        for(int element: numb){
            if(element == 0){
                count = 0;
            }else{
                count++;
            }
            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}
