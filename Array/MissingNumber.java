package Array;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,7};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int[] arr) {
        // code here
        int result =0;
        int max = 0;
        int sum =0;
        for(int num:arr){
            if(num>max){
                max =num;
            }
            sum += num;
        }
        if(max == arr.length ){
            return max+1;
        }
        System.out.println(sum);
        int actualSum =0;

        if(max%2 ==0){
            actualSum = (max+1 )*(max/2);
        }else{
            actualSum = ((max+1)*(max/2))+(max+1)/2;
        }
        System.out.println(actualSum);
        return (actualSum - sum);
    }
}
