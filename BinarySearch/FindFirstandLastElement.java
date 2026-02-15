
public class FindFirstandLastElement{
    public static void main(String[] args){
        int[] arr={5,5,5,5,7,8,9,11,21,31,42,55,55,55};
        int element = 55;
        int result = lastOccurance(arr,element);
        if(result == -1){
            System.out.println();
            System.out.println(" Element "+element+"is not present in array "+arr);
        }else{
            System.out.println();
            System.out.println("Element "+element+" last occured at "+result);
        }
    }

    public static int binarySearch(int[] arr, int k){
        int length= arr.length;
        int left = 0;//left pointer
        int right =length-1;//right pointer
        int mid;
        // Traversing loop the while loop
        while(left<=right){
            mid = left + (right-left)/2;
            /*using this formula because if array is large 
            left+right can overflow*/

            if(arr[mid] == k){
                return mid;
            }else if(arr[mid]<k){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return -1;
    }

    //First Occurance of element using binary search
    static int firstOccurance(int[] arr, int k){
        int lenght = arr.length;
        int left=0;
        int right = lenght -1;
        int mid;
        while(left<right){
            mid = left + (right-left)/2;
            if(arr[mid] == k){
                if((mid>0) && (arr[mid-1] == k)){
                    right = mid;
                }else{
                    return mid;
                }
            }else if(arr[mid]<left){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return -1;
    }



    // Last Occurance using binary Search
    static int lastOccurance(int[] arr, int k){
        int length= arr.length;
        int left = 0;//left pointer
        int right =length-1;//right pointer
        int mid;

        while(left <=right){
            mid = left + (right-left)/2;
            if(arr[mid] == k){
                if((mid < length) && (arr[mid+1] == k)){
                    left = mid+1;
                }else{
                    return mid;
                }
            }else if (arr[mid]<left){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

}