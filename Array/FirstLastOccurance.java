package Array;

class FirstLastOccurance{
    public static void main (String[] args){
        int[] array ={2,7,2,7,3,6,9,1};
        int element =7;
         // for first occurance
         int result1 = firstOccurance(array, element);
         if(result1==-1){
            System.out.println("Element "+element+" is not present");
         }else{
            System.out.println("Element "+element+" first occure at "+result1);
         }

         // Last Occurance 
         int result2 = lastOccurance(array,element);
         if(result2 == -1){
            System.out.println("Element " + element+"is not present");
         }else{
            System.out.println("Element "+element+" last occurred at "+result2);
         }
    }
    public static int firstOccurance(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurance(int[] arr, int k){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}