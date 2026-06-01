package BinarySearch;

public class LowerBound_UpperBound {
    public static void main(String[] args){
        LowerBound_UpperBound lu = new LowerBound_UpperBound();
        int arr[] ={1,2,2,2,2,3,3,4};
        System.out.println(lu.lowerBound(arr, 2));
        System.out.println(lu.upperBound(arr, 2));
    }

    public int lowerBound(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int result = arr.length;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]<key){
                result = mid+1;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }

    public int upperBound(int[] arr, int key){
        int low =0; int high = arr.length-1;
        int mid = 0;
        int result = arr.length;
        while(low<=high){
            mid = low +(high-low)/2;
            if(arr[mid]>key){
                result = mid;
                high = mid-1;

            }else{
                low = mid+1;
            }
        }
        return result;
    }

}
