class BinarySearch{
    public static void main(String[] args){
        int[] arr={5,7,8,9,11,21,31,42,55};
        int element = 3;
        int result = binarySearch(arr,element);
        if(result == -1){
            System.out.println("Element "+element+"is not present in array "+arr);
        }else{
            System.out.println("Element "+element+"is present at "+result);
        }
    }

    public static int binarySearch(int[] arr, int k){
        int length= arr.length;
        int left = 0;//left pointer
        int right =length-1;//right pointer
        int mid;
        // Traversing loop
        while(left<=right){
            mid = left + (right-left)/2; 
            /*using this formula because if array is large 
            left+right can overflow*/

            if(arr[mid] == k){
                return mid;
            }else if(arr[mid]<k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}