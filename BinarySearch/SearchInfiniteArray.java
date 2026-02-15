

public class SearchInfiniteArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,22,24,26,28,29,33,44,55,62,64,77,85,87,88,91,93,94,95,96,96,97,98,100};
        System.out.println(searchInChunks(array, 16));
    }

    public static int searchInChunks(int[] arr, int target){
        int end = 1, start = 0;
        int chunkLength = 2;
        while(arr[end] <= target){
            if(arr[end] == target){
                return end;
            }
             chunkLength *=2;
              start = end+1;
              end = start+chunkLength;
        }
        return binarySearch(arr, target, start, end)+1;
    }

    public static int binarySearch(int[] arr, int k, int left, int right){
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
                right = mid;
            }
        }
        return -1;
    }
}
