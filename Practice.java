import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4};
        System.out.println(permutations(arr));

//        String str = "sadbutstdadaccefsadcefsadcefsadefop";
//        String pattern = "sadcefsadef";
//        System.out.println(strStr(str, pattern));

    }

    static List<List<Integer>> permutations(int[] nums){
        int[] arr = nums.clone();   // clean copy
        Arrays.sort(arr);           // important for correct order
        int[] original = arr.clone();
        int count=0;
        int possible = 1;


        List<List<Integer>> list = new ArrayList<>();

        do {
            List<Integer> temp = new ArrayList<>();
            count++;
            for(int i : arr){
                temp.add(i);
            }
            list.add(temp);

            nextPermutation(arr);

        } while(!Arrays.equals(arr, original));

        System.out.println(count);

        return list;
    }


    static void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-1; i>0;i--){
            if(nums[i-1] < nums[i]){
                index = i-1;
                break;
            }
        }
        if(index ==-1){
            reverse(nums, index);
            return ;
        }
        int nextIndex = 0;
        int max = Integer.MAX_VALUE;
        for(int i=index+1; i<nums.length; i++){
            if(nums[i] > nums[index] && nums[i] < max){
                max = nums[i];
                nextIndex = i;
            }
        }

        swap(nums, nextIndex, index);

        reverse(nums, index);


    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i){
        int left = i+1;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        }
    }


    // Two Sum problem

    static boolean sumExist(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(k-arr[i])){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }

//    public static int strStr(String haystack, String needle) {
//
//        // first find LSP
//
//        int[] lsp = new int[needle.length()];
//        lsp[0] = 0;
//        int left =0;
//        for(int right=1; right<needle.length(); right++ ){
//            if(needle.charAt(right) == needle.charAt(left)){
//                left++;
//                lsp[right] = left;
//            }else if(needle.charAt(right) != needle.charAt(left)){
//                if(left!=0){
//                    left = lsp[left-1];
//                }
//            }else{
//                lsp[right] = left;
//            }
//        }
//        System.out.println(Arrays.toString(lsp));
//
//        // ocurances of patterns in string
//        int[] arr = new int[haystack.length()];
//        int j=0, i=0;
//        while( i<arr.length){
//            if(j == needle.length()){
//                j=0;
//            }
//            if(needle.charAt(j) == haystack.charAt(i)){
//                arr[i] = j;
//                j++;
//                i++;
//            }else if(needle.charAt(j) != haystack.charAt(i)){
//                if(j!=0){
//                    j = lsp[j-1];
//                }else{
//                    i++;
//                }
//            }else{
//                arr[i] = j;
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        // find first occurance of pattern
//        int l = needle.length()-1;// last index 0f pattern
//        boolean flag = false;
//
//        for(int k=0; k<arr.length; k++){
//            if(arr[k] == l){ // check whether last index of pattern occur in arr(string) or not
//                l = k;
//                flag = true;
//                break;
//            }
//        }
//        System.out.println(l);
//        int result =-1;
//        if(flag){
//            result =  l-(lsp.length)+1; // index of pattern's first char
//        }
//
//        return result;
//    }
}
