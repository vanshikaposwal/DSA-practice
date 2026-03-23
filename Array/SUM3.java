package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUM3 {
    public static void main(String[] args){
        int[] arr={1,2,0,1,0,0,0,0};
        System.out.println(threeSum(arr));

    }
    static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int j= i+1, k=arr.length-1;
            int sum=0;

            while(j<k){
                sum = arr[i]+ arr[j]+ arr[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else {
                    result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;


                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return result;
    }
}
