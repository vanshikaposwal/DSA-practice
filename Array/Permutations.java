package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    static List<List<Integer>> permutations(int[] nums){
        int[] arr = nums.clone();   // clean copy
        Arrays.sort(arr);           // important for correct order
        int[] original = arr.clone();
        int count=0;

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
}
