public class PeakIndex {
    public static void main(String[] args) {
        int[] arr= {1,7,5,3,1,0};
        int start = 0;
        int end=arr.length-1;
        int mid =0;

        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid+1]>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        System.out.println(mid);
    }
}
