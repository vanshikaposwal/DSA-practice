package Array;

public class ArraySortedRotated {
    public static void main(String[] args){
        int[] arr ={3,4,5,6,7,1,2,3};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        int rotations = 0;
        for(int i = arr.length-1; i>=0 ; i--){
            if(arr[i] <=arr[i-1]){
                rotations++;
            }else{
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            int j = (i+rotations) % arr.length;
            if(arr[i] != arr[j]){
                return false;
            }
        }
        return true;
    }
}
